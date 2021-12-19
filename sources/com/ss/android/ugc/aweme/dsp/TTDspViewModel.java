package com.ss.android.ugc.aweme.dsp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.dsp.ui.MusicDspTab;
import com.ss.android.ugc.aweme.dsp.ui.a.a.c;
import com.ss.android.ugc.aweme.dsp.ui.a.a.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TTDspViewModel extends ac {

    /* renamed from: e  reason: collision with root package name */
    public static final a f83231e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.ui.a.a.a f83232a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.dsp.ui.a.a.a> f83233b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.ui.a.a.b f83234c;

    /* renamed from: d  reason: collision with root package name */
    public MusicDspTab f83235d;

    static {
        Covode.recordClassIndex(51891);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51892);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.dsp.TTDspViewModel$a$a  reason: collision with other inner class name */
        public static final class C1955a implements ad.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f83236a;

            static {
                Covode.recordClassIndex(51893);
            }

            C1955a(e eVar) {
                this.f83236a = eVar;
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new TTDspViewModel(this.f83236a);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static TTDspViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = new ad(eVar, new C1955a(eVar)).a(TTDspViewModel.class);
            l.b(a2, "");
            return (TTDspViewModel) a2;
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.dsp.ui.a.a.b {
        static {
            Covode.recordClassIndex(51894);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.b
        public final <T extends View> T a(dj djVar) {
            l.d(djVar, "");
            return new d(djVar);
        }

        @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.b
        public final List<com.ss.android.ugc.aweme.dsp.ui.a.a.a> a(Context context) {
            l.d(context, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c(context));
            arrayList.add(new com.ss.android.ugc.aweme.dsp.ui.a.a.e(context));
            return arrayList;
        }
    }

    public final String a() {
        String a2;
        com.ss.android.ugc.aweme.dsp.ui.a.a.a aVar = this.f83232a;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return "";
        }
        return a2;
    }

    public final String b() {
        com.ss.android.ugc.aweme.dsp.ui.a.a.a aVar = this.f83232a;
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public TTDspViewModel(e eVar) {
        l.d(eVar, "");
        ArrayList arrayList = new ArrayList();
        this.f83233b = arrayList;
        b bVar = new b();
        this.f83234c = bVar;
        arrayList.addAll(bVar.a(eVar));
    }

    public final void a(Bundle bundle) {
        l.d(bundle, "");
        MusicDspTab musicDspTab = this.f83235d;
        if (musicDspTab != null) {
            musicDspTab.a(this.f83233b.get(1).a());
        }
    }

    public final int a(String str) {
        l.d(str, "");
        int i2 = 0;
        for (com.ss.android.ugc.aweme.dsp.ui.a.a.a aVar : this.f83233b) {
            if (l.a((Object) aVar.a(), (Object) str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final Bundle b(String str) {
        T t;
        l.d(str, "");
        Iterator<T> it = this.f83233b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) str, (Object) t.a())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.c();
        }
        return null;
    }
}
