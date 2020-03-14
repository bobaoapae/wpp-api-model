package br.com.zapia.wpp.api.model.payloads;

public class AddChatMessageListenerRequest {

    private String chatId;
    private boolean includeMe;
    private String eventType;
    private String[] properties;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public boolean isIncludeMe() {
        return includeMe;
    }

    public void setIncludeMe(boolean includeMe) {
        this.includeMe = includeMe;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
