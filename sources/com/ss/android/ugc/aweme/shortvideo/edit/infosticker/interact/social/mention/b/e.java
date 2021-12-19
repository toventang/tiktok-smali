package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.mention.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e extends b<d, c> {

    /* renamed from: a  reason: collision with root package name */
    public String f127761a;

    /* renamed from: d  reason: collision with root package name */
    private final h f127762d = i.a((h.f.a.a) a.f127764a);

    /* renamed from: e  reason: collision with root package name */
    private String f127763e;

    static {
        Covode.recordClassIndex(83736);
    }

    private final d d() {
        return (d) this.f127762d.getValue();
    }

    static final class a extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f127764a = new a();

        static {
            Covode.recordClassIndex(83737);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.b
    public final void a() {
        d dVar;
        super.a();
        c cVar = (c) this.f127623c;
        if (cVar != null && (dVar = (d) this.f127622b) != null && dVar.f127755a) {
            cVar.i();
        }
    }

    public e() {
        d d2 = d();
        l.d(d2, "");
        this.f127622b = d2;
        T t = this.f127622b;
        if (t != null) {
            t.f127621f.add(this);
        }
        this.f127763e = "";
        this.f127761a = "";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.d, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.b
    public final void b() {
        String str;
        super.b();
        T t = d().f127620e;
        if (t != null) {
            d dVar = (d) this.f127622b;
            String str2 = "";
            if (dVar != null && dVar.f127755a) {
                LogPbBean logPbBean = t.f121537b;
                if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                    str = str2;
                }
                this.f127763e = str;
            }
            String str3 = t.f121538c;
            if (str3 != null) {
                str2 = str3;
            }
            this.f127761a = str2;
            ac.a.f91473a.a(this.f127761a, t.f121537b);
            c cVar = (c) this.f127623c;
            if (cVar != null) {
                cVar.a(t);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.d, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.b
    public final void a(Exception exc) {
        super.a(exc);
        c cVar = (c) this.f127623c;
        if (cVar != null) {
            cVar.j();
        }
        this.f127763e = "";
    }
}
