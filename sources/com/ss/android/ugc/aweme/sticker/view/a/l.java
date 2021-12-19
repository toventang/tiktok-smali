package com.ss.android.ugc.aweme.sticker.view.a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.m.i;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.tools.utils.j;
import f.a.t;
import h.p;

public interface l {
    static {
        Covode.recordClassIndex(88959);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f136198a;

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.sticker.types.lock.a f136199b;

        /* renamed from: c  reason: collision with root package name */
        public final j f136200c;

        /* renamed from: d  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.sticker.panel.a.b f136201d;

        /* renamed from: e  reason: collision with root package name */
        public LiveData<n> f136202e;

        /* renamed from: f  reason: collision with root package name */
        public Integer f136203f;

        /* renamed from: g  reason: collision with root package name */
        public t<p<Integer, Integer>> f136204g;

        static {
            Covode.recordClassIndex(88960);
        }

        public a() {
            this(null, null, null, 127);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.f.b.l.a(this.f136198a, aVar.f136198a) && h.f.b.l.a(this.f136199b, aVar.f136199b) && h.f.b.l.a(this.f136200c, aVar.f136200c) && h.f.b.l.a(this.f136201d, aVar.f136201d) && h.f.b.l.a(this.f136202e, aVar.f136202e) && h.f.b.l.a(this.f136203f, aVar.f136203f) && h.f.b.l.a(this.f136204g, aVar.f136204g);
        }

        public final int hashCode() {
            i iVar = this.f136198a;
            int i2 = 0;
            int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
            com.ss.android.ugc.aweme.sticker.types.lock.a aVar = this.f136199b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            j jVar = this.f136200c;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            com.ss.android.ugc.aweme.sticker.panel.a.b bVar = this.f136201d;
            int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            LiveData<n> liveData = this.f136202e;
            int hashCode5 = (hashCode4 + (liveData != null ? liveData.hashCode() : 0)) * 31;
            Integer num = this.f136203f;
            int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
            t<p<Integer, Integer>> tVar = this.f136204g;
            if (tVar != null) {
                i2 = tVar.hashCode();
            }
            return hashCode6 + i2;
        }

        public final String toString() {
            return "Optional(viewMob=" + this.f136198a + ", lockStickerProcessor=" + this.f136199b + ", logger=" + this.f136200c + ", autoUseStickerMatcherController=" + this.f136201d + ", stickerViewStateLiveData=" + this.f136202e + ", curSelectedPagerPosition=" + this.f136203f + ", stickerCategoryFragmentSelectedObserver=" + this.f136204g + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(i iVar, com.ss.android.ugc.aweme.sticker.types.lock.a aVar, j jVar, int i2) {
            this((i2 & 1) != 0 ? null : iVar, (i2 & 2) != 0 ? null : aVar, (i2 & 4) == 0 ? jVar : null, null, null, null, null);
        }

        public a(i iVar, com.ss.android.ugc.aweme.sticker.types.lock.a aVar, j jVar, com.ss.android.ugc.aweme.sticker.panel.a.b bVar, LiveData<n> liveData, Integer num, t<p<Integer, Integer>> tVar) {
            this.f136198a = iVar;
            this.f136199b = aVar;
            this.f136200c = jVar;
            this.f136201d = bVar;
            this.f136202e = liveData;
            this.f136203f = num;
            this.f136204g = tVar;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final o f136205a;

        /* renamed from: b  reason: collision with root package name */
        public final d f136206b;

        /* renamed from: c  reason: collision with root package name */
        public final h f136207c;

        /* renamed from: d  reason: collision with root package name */
        public final i f136208d;

        /* renamed from: e  reason: collision with root package name */
        public final g f136209e;

        /* renamed from: f  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.sticker.panel.h f136210f;

        static {
            Covode.recordClassIndex(88961);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.f.b.l.a(this.f136205a, bVar.f136205a) && h.f.b.l.a(this.f136206b, bVar.f136206b) && h.f.b.l.a(this.f136207c, bVar.f136207c) && h.f.b.l.a(this.f136208d, bVar.f136208d) && h.f.b.l.a(this.f136209e, bVar.f136209e) && h.f.b.l.a(this.f136210f, bVar.f136210f);
        }

        public final int hashCode() {
            o oVar = this.f136205a;
            int i2 = 0;
            int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            d dVar = this.f136206b;
            int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
            h hVar = this.f136207c;
            int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
            i iVar = this.f136208d;
            int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
            g gVar = this.f136209e;
            int hashCode5 = (hashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            com.ss.android.ugc.aweme.sticker.panel.h hVar2 = this.f136210f;
            if (hVar2 != null) {
                i2 = hVar2.hashCode();
            }
            return hashCode5 + i2;
        }

        public final String toString() {
            return "Required(stickerDataManager=" + this.f136205a + ", clickController=" + this.f136206b + ", stickerMobHelper=" + this.f136207c + ", stickerMonitor=" + this.f136208d + ", tagHandler=" + this.f136209e + ", stickerViewConfigure=" + this.f136210f + ")";
        }

        public b(o oVar, d dVar, h hVar, i iVar, g gVar, com.ss.android.ugc.aweme.sticker.panel.h hVar2) {
            h.f.b.l.d(oVar, "");
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(hVar, "");
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(gVar, "");
            h.f.b.l.d(hVar2, "");
            this.f136205a = oVar;
            this.f136206b = dVar;
            this.f136207c = hVar;
            this.f136208d = iVar;
            this.f136209e = gVar;
            this.f136210f = hVar2;
        }
    }
}
