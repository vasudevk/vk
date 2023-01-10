package io.vk.objects;

public class Log {

    private final int timeTaken;
    private final String start;
    private final String end;
    private final String name;
    private final String status;

    public Log(int timeTaken, String name) {
        this(timeTaken, null, null, name, null);
    }

    public Log(int timeTaken, String start, String end, String name, String status) {

        this.timeTaken = timeTaken;
        this.start = start;
        this.end = end;
        this.name = name;
        this.status = status;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}