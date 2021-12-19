package com.ss.android.ugc.gamora.recorder.sticker.c.b;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.als.ApiCenter;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.port.in.aq;
import com.ss.android.ugc.aweme.port.in.p;
import com.ss.android.ugc.aweme.property.y;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import h.z;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f148365a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<String, Integer> f148366b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final SafeHandler f148367c;

    /* renamed from: d  reason: collision with root package name */
    public RecordPresetResource f148368d;

    /* renamed from: e  reason: collision with root package name */
    public long f148369e;

    /* renamed from: f  reason: collision with root package name */
    public long f148370f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f148371g;

    /* renamed from: h  reason: collision with root package name */
    final String f148372h;

    /* renamed from: i  reason: collision with root package name */
    public a f148373i;

    /* renamed from: j  reason: collision with root package name */
    public a f148374j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.appcompat.app.d f148375k;

    /* renamed from: l  reason: collision with root package name */
    public final ShortVideoContext f148376l;

    /* renamed from: m  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.sticker.c.j f148377m;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.b.b$b  reason: collision with other inner class name */
    public interface AbstractC4007b {
        static {
            Covode.recordClassIndex(97773);
        }

        void a();

        void a(com.ss.android.ugc.aweme.shortvideo.c cVar);

        void a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str);

        void a(Effect effect);

        void b();

        void b(Effect effect);

        void c();

        void d();

        void e();
    }

    static {
        Covode.recordClassIndex(97771);
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f148384a = new c();

        static {
            Covode.recordClassIndex(97774);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f148401a = new o();

        static {
            Covode.recordClassIndex(97786);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public final void a(Effect effect, AbstractC4007b bVar) {
        com.ss.android.ugc.aweme.sticker.f.e.a(this.f148377m, h.a.n.a(effect), true, true, new e(this, bVar), 0, null, 744);
    }

    public final void a(String str, h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.c, z> bVar) {
        com.ss.android.ugc.aweme.port.in.c.f115629h.a(str, new i(this, bVar));
    }

    public final void a(String str, int i2) {
        if (!this.f148366b.isEmpty()) {
            if (this.f148366b.containsKey(str)) {
                this.f148366b.put(str, Integer.valueOf(i2));
            }
            int i3 = 0;
            for (Integer num : this.f148366b.values()) {
                h.f.b.l.b(num, "");
                i3 += num.intValue();
            }
            a aVar = this.f148365a;
            if (aVar != null) {
                aVar.setProgress(i3 / this.f148366b.size());
            }
        }
    }

    public static final class h implements aq {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractC4007b f148392b;

        static {
            Covode.recordClassIndex(97779);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a() {
            this.f148392b.c();
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            if (cVar == null) {
                this.f148392b.c();
            } else if ((!AVCommerceServiceImpl.h().a() || cVar.isCommerceMusic()) && com.ss.android.ugc.aweme.port.in.c.f115629h.a(cVar, this.f148391a.f148375k, false)) {
                this.f148392b.a(cVar);
            } else {
                this.f148392b.d();
            }
        }

        h(b bVar, AbstractC4007b bVar2) {
            this.f148391a = bVar;
            this.f148392b = bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.f148366b.containsKey("music");
    }

    public final boolean e() {
        return this.f148366b.containsKey("effect");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Effect f148378a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.shortvideo.c f148379b;

        /* renamed from: c  reason: collision with root package name */
        public String f148380c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f148381d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f148382e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f148383f;

        static {
            Covode.recordClassIndex(97772);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.f.b.l.a(this.f148378a, aVar.f148378a) && h.f.b.l.a(this.f148379b, aVar.f148379b) && h.f.b.l.a(this.f148380c, aVar.f148380c) && this.f148381d == aVar.f148381d && this.f148382e == aVar.f148382e && this.f148383f == aVar.f148383f;
        }

        public final int hashCode() {
            Effect effect = this.f148378a;
            int i2 = 0;
            int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
            com.ss.android.ugc.aweme.shortvideo.c cVar = this.f148379b;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
            String str = this.f148380c;
            if (str != null) {
                i2 = str.hashCode();
            }
            int i3 = (hashCode2 + i2) * 31;
            boolean z = this.f148381d;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = (i3 + i5) * 31;
            boolean z2 = this.f148382e;
            if (z2) {
                z2 = true;
            }
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = z2 ? 1 : 0;
            int i12 = (i8 + i9) * 31;
            if (!this.f148383f) {
                i4 = 0;
            }
            return i12 + i4;
        }

        public final String toString() {
            return "LoadResult(effect=" + this.f148378a + ", avMusic=" + this.f148379b + ", musicFile=" + this.f148380c + ", musicDone=" + this.f148381d + ", effectDone=" + this.f148382e + ", musicInvalid=" + this.f148383f + ")";
        }

        private a() {
            this.f148378a = null;
            this.f148379b = null;
            this.f148380c = null;
            this.f148381d = false;
            this.f148382e = false;
            this.f148383f = false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148402a;

        static {
            Covode.recordClassIndex(97787);
        }

        public p(b bVar) {
            this.f148402a = bVar;
        }

        public final void run() {
            a aVar = this.f148402a.f148365a;
            if (aVar != null) {
                aVar.a((Boolean) true);
            }
            a aVar2 = this.f148402a.f148365a;
            if (aVar2 != null) {
                aVar2.a(new View.OnClickListener(this) {
                    /* class com.ss.android.ugc.gamora.recorder.sticker.c.b.b.p.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ p f148403a;

                    static {
                        Covode.recordClassIndex(97788);
                    }

                    {
                        this.f148403a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        b bVar = this.f148403a.f148402a;
                        bVar.f148371g = true;
                        a aVar = bVar.f148365a;
                        if (aVar != null) {
                            aVar.a(c.f148384a);
                        }
                        RecordPresetResource recordPresetResource = bVar.f148368d;
                        if (recordPresetResource == null) {
                            h.f.b.l.a("recordPresetResource");
                        }
                        bVar.c(recordPresetResource);
                        bVar.f148373i.f148381d = true;
                        bVar.f148373i.f148382e = true;
                        bVar.a();
                        RecordPresetResource recordPresetResource2 = bVar.f148368d;
                        if (recordPresetResource2 == null) {
                            h.f.b.l.a("recordPresetResource");
                        }
                        r.a("click_cancel_loading", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("shoot_way", bVar.f148376l.r).a("content_source", bVar.f148376l.j().getContentSource()).a("content_type", bVar.f148376l.j().getContentType()).a("creation_id", bVar.f148376l.q).a("group_id", dv.a()).a("music_id", b.a(recordPresetResource2)).a("musci_id", b.b(recordPresetResource2)).f149193a);
                    }
                });
            }
        }
    }

    private final void h() {
        if (!this.f148371g) {
            new com.bytedance.tux.g.b(this.f148375k).e(R.string.auy).b();
        }
    }

    public static final class l implements AbstractC4007b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148397a;

        static {
            Covode.recordClassIndex(97783);
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a() {
            if (!this.f148397a.f148371g) {
                this.f148397a.f148373i.f148382e = true;
                this.f148397a.f148373i.f148378a = null;
                this.f148397a.a(System.currentTimeMillis() - this.f148397a.f148370f, 0, "effect");
                this.f148397a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void b() {
            if (!this.f148397a.f148371g) {
                this.f148397a.f148373i.f148382e = true;
                this.f148397a.f148373i.f148378a = null;
                this.f148397a.a(System.currentTimeMillis() - this.f148397a.f148370f, 0, "effect");
                this.f148397a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void c() {
            if (!this.f148397a.f148371g) {
                this.f148397a.f148373i.f148381d = true;
                this.f148397a.f148373i.f148379b = null;
                this.f148397a.f148373i.f148380c = null;
                this.f148397a.a(System.currentTimeMillis() - this.f148397a.f148369e, 0, "music");
                this.f148397a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void d() {
            if (!this.f148397a.f148371g) {
                this.f148397a.f148373i.f148381d = true;
                this.f148397a.f148373i.f148379b = null;
                this.f148397a.f148373i.f148380c = null;
                this.f148397a.f148373i.f148383f = true;
                this.f148397a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void e() {
            if (!this.f148397a.f148371g) {
                this.f148397a.f148373i.f148381d = true;
                this.f148397a.f148373i.f148379b = null;
                this.f148397a.f148373i.f148380c = null;
                this.f148397a.a(System.currentTimeMillis() - this.f148397a.f148369e, 0, "music");
                this.f148397a.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        l(b bVar) {
            this.f148397a = bVar;
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            h.f.b.l.d(cVar, "");
            if (!this.f148397a.f148371g) {
                String a2 = b.a(cVar);
                if (a2 != null) {
                    a(cVar, a2);
                } else {
                    this.f148397a.a(cVar, this);
                }
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void b(Effect effect) {
            h.f.b.l.d(effect, "");
            if (!this.f148397a.f148371g) {
                this.f148397a.a("effect", 100);
                this.f148397a.f148373i.f148382e = true;
                this.f148397a.f148373i.f148378a = effect;
                this.f148397a.a(System.currentTimeMillis() - this.f148397a.f148370f, 1, "effect");
                this.f148397a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a(Effect effect) {
            h.f.b.l.d(effect, "");
            if (!this.f148397a.f148371g) {
                this.f148397a.a(effect, this);
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(str, "");
            if (!this.f148397a.f148371g) {
                this.f148397a.a("music", 100);
                this.f148397a.f148373i.f148381d = true;
                this.f148397a.f148373i.f148379b = cVar;
                this.f148397a.f148373i.f148380c = str;
                this.f148397a.a(System.currentTimeMillis() - this.f148397a.f148369e, 1, "music");
                this.f148397a.a();
            }
        }
    }

    public static final class m implements AbstractC4007b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecordPresetResource f148399b;

        static {
            Covode.recordClassIndex(97784);
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a() {
            if (!this.f148398a.f148371g) {
                this.f148398a.f148373i.f148382e = true;
                this.f148398a.f148373i.f148378a = null;
                this.f148398a.a(System.currentTimeMillis() - this.f148398a.f148370f, 0, "effect");
                this.f148398a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void b() {
            if (!this.f148398a.f148371g) {
                this.f148398a.f148373i.f148382e = true;
                this.f148398a.f148373i.f148378a = null;
                this.f148398a.a(System.currentTimeMillis() - this.f148398a.f148370f, 0, "effect");
                this.f148398a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void d() {
            if (!this.f148398a.f148371g) {
                this.f148398a.f148373i.f148381d = true;
                this.f148398a.f148373i.f148379b = null;
                this.f148398a.f148373i.f148380c = null;
                this.f148398a.f148373i.f148383f = true;
                if (this.f148398a.e()) {
                    this.f148398a.a(this.f148399b, this);
                } else {
                    this.f148398a.a();
                }
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void c() {
            if (!this.f148398a.f148371g) {
                this.f148398a.f148373i.f148381d = true;
                this.f148398a.f148373i.f148379b = null;
                this.f148398a.f148373i.f148380c = null;
                this.f148398a.a(System.currentTimeMillis() - this.f148398a.f148369e, 0, "music");
                if (this.f148398a.e()) {
                    this.f148398a.a(this.f148399b, this);
                } else {
                    this.f148398a.a();
                }
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void e() {
            if (!this.f148398a.f148371g) {
                this.f148398a.f148373i.f148381d = true;
                this.f148398a.f148373i.f148379b = null;
                this.f148398a.f148373i.f148380c = null;
                this.f148398a.a(System.currentTimeMillis() - this.f148398a.f148369e, 0, "music");
                if (this.f148398a.e()) {
                    this.f148398a.a(this.f148399b, this);
                } else {
                    this.f148398a.a();
                }
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            h.f.b.l.d(cVar, "");
            if (!this.f148398a.f148371g) {
                String a2 = b.a(cVar);
                if (a2 != null) {
                    a(cVar, a2);
                } else {
                    this.f148398a.a(cVar, this);
                }
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void b(Effect effect) {
            h.f.b.l.d(effect, "");
            if (!this.f148398a.f148371g) {
                this.f148398a.a("effect", 100);
                this.f148398a.f148373i.f148382e = true;
                this.f148398a.f148373i.f148378a = effect;
                this.f148398a.a(System.currentTimeMillis() - this.f148398a.f148370f, 1, "effect");
                this.f148398a.a();
            }
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a(Effect effect) {
            h.f.b.l.d(effect, "");
            if (!this.f148398a.f148371g) {
                this.f148398a.a(effect, this);
            }
        }

        m(b bVar, RecordPresetResource recordPresetResource) {
            this.f148398a = bVar;
            this.f148399b = recordPresetResource;
        }

        @Override // com.ss.android.ugc.gamora.recorder.sticker.c.b.b.AbstractC4007b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(str, "");
            if (!this.f148398a.f148371g) {
                this.f148398a.a("music", 100);
                this.f148398a.f148373i.f148381d = true;
                this.f148398a.f148373i.f148379b = cVar;
                this.f148398a.f148373i.f148380c = str;
                this.f148398a.a(System.currentTimeMillis() - this.f148398a.f148369e, 1, "music");
                if (this.f148398a.e()) {
                    this.f148398a.a(this.f148399b, this);
                } else {
                    this.f148398a.a();
                }
            }
        }
    }

    private final void g() {
        Effect effect = this.f148374j.f148378a;
        if (effect != null) {
            a(effect);
        }
        if (this.f148374j.f148379b != null && this.f148374j.f148380c != null) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = this.f148374j.f148379b;
            if (cVar == null) {
                h.f.b.l.b();
            }
            String str = this.f148374j.f148380c;
            if (str == null) {
                h.f.b.l.b();
            }
            a(cVar, str);
        }
    }

    private final void i() {
        if (!this.f148371g && h.a.n.b("prop_page", "prop_reuse", "anchor_combine_prop", "scan").contains(this.f148376l.r)) {
            new com.bytedance.tux.g.b(this.f148375k).e(R.string.auv).b();
        }
    }

    private final void j() {
        if (!this.f148371g && h.a.n.b("single_song", "collection_music", "draft_again").contains(this.f148376l.r)) {
            new com.bytedance.tux.g.b(this.f148375k).e(R.string.auw).b();
        }
    }

    public final boolean c() {
        RecordPresetResource recordPresetResource = this.f148368d;
        if (recordPresetResource == null) {
            h.f.b.l.a("recordPresetResource");
        }
        if (!TextUtils.isEmpty(recordPresetResource.getEffectId())) {
            return true;
        }
        RecordPresetResource recordPresetResource2 = this.f148368d;
        if (recordPresetResource2 == null) {
            h.f.b.l.a("recordPresetResource");
        }
        if (recordPresetResource2.getEffect() != null) {
            return true;
        }
        return false;
    }

    public final Map<String, String> f() {
        boolean z;
        HashMap hashMap = new HashMap();
        androidx.appcompat.app.d dVar = this.f148375k;
        if (!(dVar instanceof VideoRecordNewActivity)) {
            dVar = null;
        }
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) dVar;
        if (videoRecordNewActivity != null) {
            String str = videoRecordNewActivity.r;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str2 = videoRecordNewActivity.r;
                h.f.b.l.b(str2, "");
                hashMap.put("scene", str2);
            }
            String str3 = videoRecordNewActivity.s;
            if (!(str3 == null || str3.length() == 0)) {
                String str4 = videoRecordNewActivity.s;
                h.f.b.l.b(str4, "");
                hashMap.put("grade_key", str4);
            }
        }
        return hashMap;
    }

    public final void a() {
        boolean z;
        if (e() && !this.f148373i.f148382e) {
            return;
        }
        if (!d() || this.f148373i.f148381d) {
            a aVar = this.f148365a;
            if (aVar != null) {
                aVar.a(o.f148401a);
            }
            com.ss.android.ugc.aweme.shortvideo.c cVar = this.f148373i.f148379b;
            String str = this.f148373i.f148380c;
            Effect effect = this.f148373i.f148378a;
            boolean z2 = true;
            if (cVar == null || str == null) {
                z = false;
            } else {
                z = true;
            }
            if (effect == null) {
                z2 = false;
            }
            boolean c2 = c();
            boolean b2 = b();
            g();
            if ((!e() || !z2) && (!d() || !z)) {
                RecordPresetResource recordPresetResource = this.f148368d;
                if (recordPresetResource == null) {
                    h.f.b.l.a("recordPresetResource");
                }
                c(recordPresetResource);
                if (c2) {
                    if (!b2) {
                        i();
                        return;
                    }
                } else if (b2) {
                    j();
                    return;
                }
                if (d() && e()) {
                    h();
                } else if (d() && !e()) {
                    j();
                } else if (e() && !d()) {
                    i();
                }
            } else {
                if (e()) {
                    if (effect != null) {
                        a(effect);
                    } else {
                        RecordPresetResource recordPresetResource2 = this.f148368d;
                        if (recordPresetResource2 == null) {
                            h.f.b.l.a("recordPresetResource");
                        }
                        c(recordPresetResource2);
                        i();
                    }
                }
                if (!d()) {
                    return;
                }
                if (cVar != null && str != null) {
                    a(cVar, str);
                } else if (!this.f148373i.f148383f) {
                    RecordPresetResource recordPresetResource3 = this.f148368d;
                    if (recordPresetResource3 == null) {
                        h.f.b.l.a("recordPresetResource");
                    }
                    c(recordPresetResource3);
                    j();
                }
            }
        }
    }

    public final boolean b() {
        RecordPresetResource recordPresetResource = this.f148368d;
        if (recordPresetResource == null) {
            h.f.b.l.a("recordPresetResource");
        }
        if (!TextUtils.isEmpty(recordPresetResource.getMusicId())) {
            return true;
        }
        RecordPresetResource recordPresetResource2 = this.f148368d;
        if (recordPresetResource2 == null) {
            h.f.b.l.a("recordPresetResource");
        }
        if (recordPresetResource2.getMusicModel() != null) {
            return true;
        }
        return false;
    }

    public static final class f implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148387a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractC4007b f148388b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f148389c;

        static {
            Covode.recordClassIndex(97777);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(int i2) {
            this.f148387a.a("music", i2);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(String str) {
            h.f.b.l.d(str, "");
            this.f148388b.a(this.f148389c, str);
        }

        @Override // com.ss.android.ugc.aweme.port.in.p.a
        public final void a(Integer num, String str) {
            this.f148388b.e();
        }

        f(b bVar, AbstractC4007b bVar2, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f148387a = bVar;
            this.f148388b = bVar2;
            this.f148389c = cVar;
        }
    }

    public static final class g implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractC4007b f148390a;

        static {
            Covode.recordClassIndex(97778);
        }

        g(AbstractC4007b bVar) {
            this.f148390a = bVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
            this.f148390a.c();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            Effect effect;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 == null || (data = effectListResponse2.getData()) == null || (effect = data.get(0)) == null) {
                this.f148390a.a();
            } else {
                this.f148390a.a(effect);
            }
        }
    }

    public static final class n implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148400a;

        static {
            Covode.recordClassIndex(97785);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        n(b bVar) {
            this.f148400a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            Effect effect;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = data.get(0)) != null) {
                com.ss.android.ugc.aweme.sticker.f.e.a(this.f148400a.f148377m, h.a.n.a(effect), true, false, null, 0, null, 1016);
            }
        }
    }

    public static final class e implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148385a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractC4007b f148386b;

        static {
            Covode.recordClassIndex(97776);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void c(Effect effect) {
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void b(Effect effect) {
            if (effect != null) {
                this.f148386b.b(effect);
            } else {
                this.f148386b.b();
            }
        }

        e(b bVar, AbstractC4007b bVar2) {
            this.f148385a = bVar;
            this.f148386b = bVar2;
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void a(Effect effect, int i2) {
            this.f148385a.a("effect", i2);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void a(Effect effect, ExceptionResult exceptionResult) {
            this.f148386b.b();
        }
    }

    public static final class k implements IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f148395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f148396b;

        static {
            Covode.recordClassIndex(97782);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
        public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
            com.ss.android.ugc.aweme.effectplatform.f fVar2 = fVar;
            if (fVar2 != null) {
                this.f148395a.element = fVar2.c(this.f148396b);
            }
        }

        public k(z.a aVar, Effect effect) {
            this.f148395a = aVar;
            this.f148396b = effect;
        }
    }

    public static final /* synthetic */ RecordPresetResource a(b bVar) {
        RecordPresetResource recordPresetResource = bVar.f148368d;
        if (recordPresetResource == null) {
            h.f.b.l.a("recordPresetResource");
        }
        return recordPresetResource;
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.shortvideo.c, h.z> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c $avMusic;
        final /* synthetic */ String $path;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
            super(1);
            this.this$0 = bVar;
            this.$avMusic = cVar;
            this.$path = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            h.f.b.l.d(cVar, "");
            this.this$0.f148374j.f148379b = this.$avMusic;
            this.this$0.f148374j.f148380c = this.$path;
            return h.z.f158842a;
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.shortvideo.c, h.z> {
        final /* synthetic */ String $path;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, b bVar) {
            super(1);
            this.$path = str;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            this.this$0.a(cVar2, this.$path);
            return h.z.f158842a;
        }
    }

    public static String a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        if (cVar == null) {
            return null;
        }
        String b2 = com.ss.android.ugc.aweme.port.in.c.f115629h.b(cVar);
        if (new File(b2).exists()) {
            return b2;
        }
        return null;
    }

    public static final class i implements aq {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148393a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f148394b;

        static {
            Covode.recordClassIndex(97780);
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.aq
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            if (cVar == null) {
                return;
            }
            if ((!AVCommerceServiceImpl.h().a() || cVar.isCommerceMusic()) && com.ss.android.ugc.aweme.port.in.c.f115629h.a(cVar, this.f148393a.f148375k, false)) {
                this.f148394b.invoke(cVar);
            }
        }

        i(b bVar, h.f.a.b bVar2) {
            this.f148393a = bVar;
            this.f148394b = bVar2;
        }
    }

    static String a(RecordPresetResource recordPresetResource) {
        String str;
        String musicId = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (!TextUtils.isEmpty(musicId)) {
            return musicId;
        }
        if (musicModel != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return musicId;
        }
        if (musicModel != null) {
            return musicModel.getMusicId();
        }
        return null;
    }

    static String b(RecordPresetResource recordPresetResource) {
        String str;
        String effectId = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (!TextUtils.isEmpty(effectId)) {
            return effectId;
        }
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return effectId;
        }
        if (effect != null) {
            return effect.getEffectId();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c(RecordPresetResource recordPresetResource) {
        if (recordPresetResource != null) {
            Effect effect = recordPresetResource.getEffect();
            String effectId = recordPresetResource.getEffectId();
            if (effect != null) {
                com.ss.android.ugc.aweme.sticker.f.e.a(this.f148377m, h.a.n.a(effect), true, false, null, 0, null, 1016);
            } else if (effectId != null) {
                com.ss.android.ugc.aweme.sticker.f.e.a(this.f148377m, h.a.n.a(effectId), f(), new n(this));
            }
        }
    }

    public static final class q extends h.f.b.m implements h.f.a.b<Effect, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(97789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Effect effect) {
            String str;
            Effect effect2 = effect;
            RecordPresetResource a2 = b.a(this.this$0);
            if (effect2 != null) {
                str = effect2.getEffectId();
            } else {
                str = null;
            }
            a2.setEffectId(str);
            b.a(this.this$0).setEffect(effect2);
            this.this$0.f148376l.V = b.a(this.this$0);
            b bVar = this.this$0;
            RecordPresetResource a3 = b.a(bVar);
            if (h.f.b.l.a((Object) bVar.f148372h, (Object) "load_serial")) {
                m mVar = new m(bVar, a3);
                if (bVar.d()) {
                    bVar.b(a3, mVar);
                } else {
                    bVar.a(a3, mVar);
                }
            } else if (h.f.b.l.a((Object) bVar.f148372h, (Object) "load_parallel")) {
                l lVar = new l(bVar);
                if (bVar.d()) {
                    bVar.b(a3, lVar);
                }
                if (bVar.e()) {
                    bVar.a(a3, lVar);
                }
            }
            return h.z.f158842a;
        }
    }

    public final void a(Effect effect) {
        Boolean bool = this.f148376l.W;
        h.f.b.l.b(bool, "");
        if (bool.booleanValue()) {
            this.f148377m.f(true);
            FaceStickerBean.sCurPropSource = "qa_prop";
        }
        com.ss.android.ugc.aweme.sticker.f.e.a(this.f148377m, h.a.n.a(effect), true, true, null, 0, null, 1016);
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, AbstractC4007b bVar) {
        com.ss.android.ugc.aweme.port.in.c.f115629h.a(this.f148375k, cVar, 6, new f(this, bVar, cVar));
    }

    /* access modifiers changed from: package-private */
    public final void b(RecordPresetResource recordPresetResource, AbstractC4007b bVar) {
        String str;
        String musicId = recordPresetResource.getMusicId();
        MusicModel musicModel = recordPresetResource.getMusicModel();
        if (TextUtils.isEmpty(musicId)) {
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                musicId = musicModel != null ? musicModel.getMusicId() : null;
            }
        }
        this.f148369e = System.currentTimeMillis();
        if (musicId == null || musicId.length() == 0) {
            this.f148373i.f148381d = true;
            this.f148373i.f148379b = null;
            this.f148373i.f148380c = null;
            a(System.currentTimeMillis() - this.f148369e, 0, "music");
            a();
            return;
        }
        com.ss.android.ugc.aweme.port.in.c.f115629h.a(musicId, new h(this, bVar));
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
        com.ss.android.ugc.gamora.recorder.choosemusic.a aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.a) ApiCenter.a.a(this.f148375k).b(com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
        if (aVar != null) {
            aVar.onChooseMusicDone(false, "", cVar, str);
            aVar.handleChooseMusic(d.a.a(false, "", cVar, str));
        }
        cr.a().a(cVar);
    }

    public final void a(RecordPresetResource recordPresetResource, AbstractC4007b bVar) {
        String str;
        String effectId = recordPresetResource.getEffectId();
        Effect effect = recordPresetResource.getEffect();
        if (TextUtils.isEmpty(effectId)) {
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                effectId = effect != null ? effect.getEffectId() : null;
            }
        }
        this.f148370f = System.currentTimeMillis();
        if (effect != null) {
            a(effect, bVar);
        } else if (effectId == null || effectId.length() == 0) {
            this.f148373i.f148382e = true;
            this.f148373i.f148378a = null;
            a(System.currentTimeMillis() - this.f148370f, 0, "effect");
            a();
        } else {
            com.ss.android.ugc.aweme.sticker.f.e.a(this.f148377m, h.a.n.a(effectId), f(), new g(bVar));
        }
    }

    public b(androidx.appcompat.app.d dVar, ShortVideoContext shortVideoContext, com.ss.android.ugc.gamora.recorder.sticker.c.j jVar) {
        String str;
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(jVar, "");
        this.f148375k = dVar;
        this.f148376l = shortVideoContext;
        this.f148377m = jVar;
        this.f148367c = new SafeHandler(dVar);
        if (y.a() == 1) {
            str = "load_serial";
        } else {
            str = "load_parallel";
        }
        this.f148372h = str;
        this.f148373i = new a((byte) 0);
        this.f148374j = new a((byte) 0);
    }

    public final void a(long j2, int i2, String str) {
        RecordPresetResource recordPresetResource = this.f148368d;
        if (recordPresetResource == null) {
            h.f.b.l.a("recordPresetResource");
        }
        r.a("loading_finish", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("shoot_way", this.f148376l.r).a("content_source", this.f148376l.j().getContentSource()).a("content_type", this.f148376l.j().getContentType()).a("creation_id", this.f148376l.q).a("group_id", dv.a()).a("music_id", a(recordPresetResource)).a("musci_id", b(recordPresetResource)).a("loading_duration", j2).a("loading_status", i2).a("loading_type", str).f149193a);
    }
}
