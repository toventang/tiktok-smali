package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h implements com.bytedance.ies.powerlist.b.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f137859d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.story.model.h f137860a;

    /* renamed from: b  reason: collision with root package name */
    public final int f137861b;

    /* renamed from: c  reason: collision with root package name */
    public final j f137862c;

    static {
        Covode.recordClassIndex(90181);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(com.bytedance.ies.powerlist.b.a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f137860a, hVar.f137860a) && this.f137861b == hVar.f137861b && l.a(this.f137862c, hVar.f137862c);
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.story.model.h hVar = this.f137860a;
        int i2 = 0;
        int hashCode = (((hVar != null ? hVar.hashCode() : 0) * 31) + this.f137861b) * 31;
        j jVar = this.f137862c;
        if (jVar != null) {
            i2 = jVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StoryViewerAndLikerItem(user=" + this.f137860a + ", type=" + this.f137861b + ", mobEventParam=" + this.f137862c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90182);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(com.bytedance.ies.powerlist.b.a aVar) {
        return aVar.equals(this);
    }

    public h(com.ss.android.ugc.aweme.story.model.h hVar, int i2, j jVar) {
        l.d(hVar, "");
        this.f137860a = hVar;
        this.f137861b = i2;
        this.f137862c = jVar;
    }
}
