package com.scp.mtapp.domains;

public class Greeting {

    private final long Id;
    private final String content;

    public Greeting(long id, String content) {
        Id = id;
        this.content = content;
    }

    public long getId() {
        return Id;
    }

    public String getContent() {
        return content;
    }
}
