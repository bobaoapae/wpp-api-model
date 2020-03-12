package br.com.zapia.wpp.api.model.payloads;

public class FindPictureRequest {

    private String id;
    private boolean full;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
}
