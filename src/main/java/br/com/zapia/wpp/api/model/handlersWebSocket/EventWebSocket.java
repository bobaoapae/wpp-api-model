package br.com.zapia.wpp.api.model.handlersWebSocket;

public enum EventWebSocket {
    AddChatMessageListener,
    AddCustomProperty,
    ChangeProfilePic,
    ClearChat,
    DeleteChat,
    DeleteMessage,
    DownloadMedia,
    FindChat,
    FindChatByNumber,
    FindMessage,
    FindPicture,
    ForwardMessage,
    GetAllChats,
    GetAllContacts,
    GetAllQuickReplies,
    GetDriverState,
    GetGroupInviteInfo,
    GetQrCode,
    GetSelfInfo,
    JoinGroupByInviteLink,
    LoadEarly,
    Logout,
    MarkComposing,
    MarkPaused,
    MarkPlayed,
    MarkRecording,
    PinChat,
    Pong,
    SeeChat,
    SendMessage,
    SendPresenceAvailable,
    SendPresenceUnavailable,
    SubscribePresence,
    UnPinChat,
    Token//TODO: Analizar como remover necessidade de ter esse enum Token
    ;

    @Override
    public String toString() {
        return Character.toLowerCase(name().charAt(0)) + name().substring(1);
    }
}
