package io.vk.objects;

public class Demo {
    private long created;
    private String scope;
    private String name;
    private long modified;
    private String description;
    private String id;
    private String type;
    private Object parentId;

    public void setCreated(long created) {
        this.created = created;
    }

    public long getCreated() {
        return created;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Object getScope() {
        return scope;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setModified(long modified) {
        this.modified = modified;
    }

    public long getModified() {
        return modified;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Object getParentId() {
        return parentId;
    }
}
