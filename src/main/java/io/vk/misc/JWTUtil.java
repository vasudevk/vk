package io.vk.misc;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * This is a demo of creating JWT tokens with simple secret key.FP
 */
public class JWTUtil {

    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.SECOND, 8600000);

        String signWithSecret = JWT.create()
                .withExpiresAt(cal.getTime())
                .withIssuer("Vasudev")
                .withClaim("username", "vasudevk")
                .withAudience("Online", "Store", "Customer Care")
                .withSubject("Can only be accessed by the authorized audience")
                .sign(Algorithm.HMAC512("vk51gn5"));

        System.out.println("JWT with HS512 :: \n" + signWithSecret);
    }
}