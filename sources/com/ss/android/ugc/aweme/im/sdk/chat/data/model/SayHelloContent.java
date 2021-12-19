package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.g.a;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.j.h;
import java.util.ArrayList;
import java.util.List;

public final class SayHelloContent extends BaseContent {
    private SayHelloContentEmoji emojiHolder;
    @c(a = "hello_text")
    public final String helloText;
    @c(a = "joker_stickers")
    private List<? extends a> jockerStickers;
    @c(a = "nickname")
    public final String nickname;
    @c(a = "stickers")
    private List<? extends a> stickers;

    static {
        Covode.recordClassIndex(64057);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a>, java.util.List<com.ss.android.ugc.aweme.emoji.g.a> */
    private final List<a> component3() {
        return this.jockerStickers;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a>, java.util.List<com.ss.android.ugc.aweme.emoji.g.a> */
    private final List<a> component4() {
        return this.stickers;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SayHelloContent copy$default(SayHelloContent sayHelloContent, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sayHelloContent.nickname;
        }
        if ((i2 & 2) != 0) {
            str2 = sayHelloContent.helloText;
        }
        if ((i2 & 4) != 0) {
            list = sayHelloContent.jockerStickers;
        }
        if ((i2 & 8) != 0) {
            list2 = sayHelloContent.stickers;
        }
        return sayHelloContent.copy(str, str2, list, list2);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.helloText;
    }

    public final SayHelloContent copy(String str, String str2, List<? extends a> list, List<? extends a> list2) {
        return new SayHelloContent(str, str2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SayHelloContent)) {
            return false;
        }
        SayHelloContent sayHelloContent = (SayHelloContent) obj;
        return l.a(this.nickname, sayHelloContent.nickname) && l.a(this.helloText, sayHelloContent.helloText) && l.a(this.jockerStickers, sayHelloContent.jockerStickers) && l.a(this.stickers, sayHelloContent.stickers);
    }

    public final int hashCode() {
        String str = this.nickname;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.helloText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<? extends a> list = this.jockerStickers;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<? extends a> list2 = this.stickers;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String toString() {
        return "SayHelloContent(nickname=" + this.nickname + ", helloText=" + this.helloText + ", jockerStickers=" + this.jockerStickers + ", stickers=" + this.stickers + ")";
    }

    public final void optimise() {
        getEmojiInternal();
    }

    public final boolean isNewStyle() {
        return getEmojiInternal() instanceof JockerEmoji;
    }

    public final List<a> getEmojiList() {
        return getEmojiInternal().getStickers();
    }

    private final SayHelloContentEmoji getEmojiInternal() {
        boolean z;
        boolean z2;
        SayHelloContentEmoji basicEmoji;
        SayHelloContentEmoji sayHelloContentEmoji = this.emojiHolder;
        if (sayHelloContentEmoji != null) {
            return sayHelloContentEmoji;
        }
        List<? extends a> list = this.stickers;
        boolean z3 = true;
        if (list == null || list.isEmpty() || list.size() < 3) {
            z = false;
        } else {
            z = true;
        }
        List<? extends a> list2 = this.jockerStickers;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        if (z || !z4) {
            z3 = false;
        }
        if (z3) {
            this.stickers = null;
            List list3 = this.jockerStickers;
            if (list3 == null) {
                list3 = z.INSTANCE;
            }
            basicEmoji = new JockerEmoji(list3);
        } else {
            this.jockerStickers = null;
            List list4 = this.stickers;
            if (list4 == null) {
                list4 = z.INSTANCE;
            }
            basicEmoji = new BasicEmoji(list4);
        }
        this.emojiHolder = basicEmoji;
        return basicEmoji;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final List<UrlModel> fetchPreload() {
        if (getEmojiList().isEmpty()) {
            return null;
        }
        List<a> a2 = n.a((List) getEmojiList(), h.a(0, Math.min(3, getEmojiList().size())));
        ArrayList arrayList = new ArrayList(n.a((Iterable) a2, 10));
        for (a aVar : a2) {
            arrayList.add(aVar.getAnimateUrl());
        }
        return arrayList;
    }

    public final void setMsgHint(String str) {
        l.d(str, "");
        this.msgHint = str;
    }

    public SayHelloContent(String str, String str2, List<? extends a> list, List<? extends a> list2) {
        this.nickname = str;
        this.helloText = str2;
        this.jockerStickers = list;
        this.stickers = list2;
    }
}
