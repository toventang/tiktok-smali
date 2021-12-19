package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ChatResult {
    @c(a = "background_image")
    private ImageModel background;
    @c(a = "content")
    private String content;
    @c(a = "display_text")
    private b displayText;
    @c(a = "fullscreen_text_color")
    private String fullScreenTextColor;
    @c(a = "id")
    private long id;
    @c(a = "msg_id")
    private long msgId;
    @c(a = "user")
    private User user;

    static {
        Covode.recordClassIndex(8663);
    }

    public ImageModel getBackground() {
        return this.background;
    }

    public String getContent() {
        return this.content;
    }

    public b getDisplayText() {
        return this.displayText;
    }

    public String getFullScreenTextColor() {
        return this.fullScreenTextColor;
    }

    public long getId() {
        return this.id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(b bVar) {
        this.displayText = bVar;
    }

    public void setFullScreenTextColor(String str) {
        this.fullScreenTextColor = str;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setMsgId(long j2) {
        this.msgId = j2;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
