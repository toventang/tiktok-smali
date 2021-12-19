package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class RoomAuthStatus {
    @c(a = "GiftAnchorMt")
    int anchorGiftType;
    @c(a = "GoldenEnvelope")
    int anchorRedEnvelopeType;
    @c(a = "Banner")
    int bannerState;
    @c(a = "ChatSubOnly")
    public boolean chatSubOnly;
    @c(a = "DonationSticker")
    int donationSticker;
    @c(a = "Chat")
    public boolean enableChat;
    @c(a = "ChatL2")
    public boolean enableChatL2;
    @c(a = "Danmaku")
    public boolean enableDanmaku;
    @c(a = "Digg")
    public boolean enableDigg;
    @c(a = "Gift")
    public boolean enableGift;
    @c(a = "LuckMoney")
    boolean enableLuckMoney;
    @c(a = "Promote")
    boolean enablePromote;
    @c(a = "Props")
    public boolean enableProps;
    @c(a = "InteractionQuestion")
    boolean enableQuestion;
    @c(a = "RoomContributor")
    boolean enableRoomContributor;
    @c(a = "Share")
    public boolean enableShare;
    @c(a = "Viewers")
    boolean enableViewers;
    @c(a = "Landscape")
    int landscape;
    @c(a = "PublicScreen")
    public int messageType;
    @c(a = "Rank")
    int rankState;
    @c(a = "transaction_history")
    int rankingsSwitchStatus;
    @c(a = "OffReason")
    RoomAuthOffReasons roomAuthOffReasons;
    @c(a = "UserCount")
    int userCountDisplayState;

    static {
        Covode.recordClassIndex(11289);
    }

    public int getBannerState() {
        return this.bannerState;
    }

    public int getPublicScreenAuth() {
        return this.messageType;
    }

    public int getRankState() {
        return this.rankState;
    }

    public int getRankingsSwitchStatus() {
        return this.rankingsSwitchStatus;
    }

    public RoomAuthOffReasons getRoomAuthOffReasons() {
        return this.roomAuthOffReasons;
    }

    public int getUserCountDisplayState() {
        return this.userCountDisplayState;
    }

    public boolean isChatL2Enabled() {
        return this.enableChatL2;
    }

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnablePromote() {
        return this.enablePromote;
    }

    public boolean isEnableProps() {
        return this.enableProps;
    }

    public boolean isEnableQuestion() {
        return this.enableQuestion;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public boolean isEnableShare() {
        return this.enableShare;
    }

    public boolean isEnableViewers() {
        return this.enableViewers;
    }

    public boolean isEnableStickerDonation() {
        if (this.donationSticker == 1) {
            return true;
        }
        return false;
    }

    public boolean showRedEnvelope() {
        if (this.anchorRedEnvelopeType == 1) {
            return true;
        }
        return false;
    }

    public boolean isAnchorGiftEnable() {
        if (this.anchorGiftType != 2) {
            return true;
        }
        return false;
    }

    public boolean isBannerEnable() {
        if (this.bannerState != 2) {
            return true;
        }
        return false;
    }

    public boolean isEnableLandscape() {
        if (this.landscape != 2) {
            return true;
        }
        return false;
    }

    public boolean isMessageEnable() {
        if (this.messageType != 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Chat:").append(this.enableChat).append(" ; ");
        sb.append("Danmaku:").append(this.enableDanmaku).append(" ; ");
        sb.append("Gift:").append(this.enableGift).append(" ; ");
        sb.append("Props:").append(this.enableProps).append(" ; ");
        sb.append("Digg:").append(this.enableDigg).append(" ; ");
        sb.append("LuckMoney:").append(this.enableLuckMoney).append(" ; ");
        sb.append("RoomContributor:").append(this.enableRoomContributor).append(" ; ");
        sb.append("Banner:").append(this.bannerState).append(" ; ");
        sb.append("GiftAnchorMt:").append(this.anchorGiftType).append(" ; ");
        sb.append("PublicScreen:").append(this.messageType).append(" ; ");
        sb.append("DonationSticker:").append(this.donationSticker).append(" ; ");
        sb.append("Share").append(this.enableShare).append(" ; ");
        sb.append("Viewers").append(this.enableViewers).append(" ; ");
        sb.append("Red Envelope:").append(this.anchorRedEnvelopeType).append(" ; ");
        sb.append("ChatL2:").append(this.enableChatL2).append(" ; ");
        return sb.toString();
    }

    public void setBannerState(int i2) {
        this.bannerState = i2;
    }

    public void setChatL2Enabled(boolean z) {
        this.enableChatL2 = z;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnablePromote(boolean z) {
        this.enablePromote = z;
    }

    public void setEnableProps(boolean z) {
        this.enableProps = z;
    }

    public void setEnableQuestion(boolean z) {
        this.enableQuestion = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }

    public void setEnableViewers(boolean z) {
        this.enableViewers = z;
    }

    public void setRankState(int i2) {
        this.rankState = i2;
    }

    public void setRankingsSwitchStatus(int i2) {
        this.rankingsSwitchStatus = i2;
    }

    public void setUserCountDisplayState(int i2) {
        this.userCountDisplayState = i2;
    }
}
