package http;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private Object status;
    private String type;
    private boolean deleted;
    private String _id;
    private String user;
    private String text;
    private int __v;
    private String source;
    private String updatedAt;
    private String createdAt;
    private boolean used;

    public Cat(@JsonProperty("status") Object status,
               @JsonProperty("type") String type,
               @JsonProperty("deleted") boolean deleted,
               @JsonProperty("_id") String _id,
               @JsonProperty("user") String user,
               @JsonProperty("text") String text,
               @JsonProperty("__v") int __v,
               @JsonProperty("source") String source,
               @JsonProperty("updatedAt") String updatedAt,
               @JsonProperty("createdAt") String createdAt,
               @JsonProperty("used") boolean used) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this._id = _id;
        this.user = user;
        this.text = text;
        this.__v = __v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;
    }

    public Object getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String get_id() {
        return _id;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public int get__v() {
        return __v;
    }

    public String getSource() {
        return source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean isUsed() {
        return used;
    }

    @Override
    public String toString() {
        return "Кот{" +
                "status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", _id='" + _id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", __v=" + __v +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                '}';
    }
}
