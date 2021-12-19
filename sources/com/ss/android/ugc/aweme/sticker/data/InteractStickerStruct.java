package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class InteractStickerStruct implements e, Serializable {
    public String attr;
    @c(a = "duet_with_me")
    public DuetStickerStruct duetStickerStruct;
    @c(a = "hashtag_info")
    public HashtagStruct hashtagInfo;
    public int index;
    @c(a = "auto_video_caption_info")
    public d mCaptionStruct;
    @c(a = "countdown_info")
    public CountDownStickerStruct mCountDownStickerStruct;
    @c(a = "question_info")
    public QaStruct mQaStruct;
    @c(a = "text_info")
    public String mTextStruct;
    @c(a = "mention_info")
    public MentionStruct mentionInfo;
    @c(a = "vote_info")
    public PollStruct pollStruct;
    @c(a = "track_info")
    public String trackList;
    public int type;

    static {
        Covode.recordClassIndex(88100);
    }

    public String getAttr() {
        return this.attr;
    }

    public d getCaptionStruct() {
        return this.mCaptionStruct;
    }

    public CountDownStickerStruct getCountDownStickerStruct() {
        return this.mCountDownStickerStruct;
    }

    public DuetStickerStruct getDuetStickerStruct() {
        return this.duetStickerStruct;
    }

    public HashtagStruct getHashtagInfo() {
        return this.hashtagInfo;
    }

    public int getIndex() {
        return this.index;
    }

    public MentionStruct getMentionInfo() {
        return this.mentionInfo;
    }

    public PollStruct getPollStruct() {
        return this.pollStruct;
    }

    public QaStruct getQaStruct() {
        return this.mQaStruct;
    }

    public String getTextStruct() {
        return this.mTextStruct;
    }

    public String getTrackList() {
        return this.trackList;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.index * 31;
    }

    public void setAttr(String str) {
        this.attr = str;
    }

    public void setCaptionStruct(d dVar) {
        this.mCaptionStruct = dVar;
    }

    public void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.mCountDownStickerStruct = countDownStickerStruct;
    }

    public void setDuetStickerStruct(DuetStickerStruct duetStickerStruct2) {
        this.duetStickerStruct = duetStickerStruct2;
    }

    public void setHashtagInfo(HashtagStruct hashtagStruct) {
        this.hashtagInfo = hashtagStruct;
    }

    public void setIndex(int i2) {
        this.index = i2;
    }

    public void setMentionInfo(MentionStruct mentionStruct) {
        this.mentionInfo = mentionStruct;
    }

    public void setPollStruct(PollStruct pollStruct2) {
        this.pollStruct = pollStruct2;
    }

    public void setQaStruct(QaStruct qaStruct) {
        this.mQaStruct = qaStruct;
    }

    public void setTextStruct(String str) {
        this.mTextStruct = str;
    }

    public void setTrackList(String str) {
        this.trackList = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
            if (this.type != interactStickerStruct.type || this.index != interactStickerStruct.index) {
                return false;
            }
            String str = this.trackList;
            if (str == null ? interactStickerStruct.trackList != null : !str.equals(interactStickerStruct.trackList)) {
                return false;
            }
            PollStruct pollStruct2 = this.pollStruct;
            if (pollStruct2 == null ? interactStickerStruct.pollStruct != null : !pollStruct2.equals(interactStickerStruct.pollStruct)) {
                return false;
            }
            HashtagStruct hashtagStruct = this.hashtagInfo;
            if (hashtagStruct == null ? interactStickerStruct.hashtagInfo != null : !hashtagStruct.equals(interactStickerStruct.hashtagInfo)) {
                return false;
            }
            MentionStruct mentionStruct = this.mentionInfo;
            if (mentionStruct == null ? interactStickerStruct.mentionInfo != null : !mentionStruct.equals(interactStickerStruct.mentionInfo)) {
                return false;
            }
            String str2 = this.mTextStruct;
            if (str2 == null ? interactStickerStruct.mTextStruct != null : !str2.equals(interactStickerStruct.mTextStruct)) {
                return false;
            }
            CountDownStickerStruct countDownStickerStruct = this.mCountDownStickerStruct;
            if (countDownStickerStruct == null ? interactStickerStruct.mCountDownStickerStruct != null : !countDownStickerStruct.equals(interactStickerStruct.mCountDownStickerStruct)) {
                return false;
            }
            QaStruct qaStruct = this.mQaStruct;
            if (qaStruct == null ? interactStickerStruct.mQaStruct != null : !qaStruct.equals(interactStickerStruct.mQaStruct)) {
                return false;
            }
            String str3 = this.attr;
            String str4 = interactStickerStruct.attr;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }
}
