package com.ss.android.ugc.aweme.notification.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.a.f;
import com.ss.android.ugc.aweme.notification.h.x;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class l extends c {

    /* renamed from: b  reason: collision with root package name */
    final h f113093b = i.a((h.f.a.a) c.f113102a);

    /* renamed from: c  reason: collision with root package name */
    final h f113094c = i.a((h.f.a.a) a.f113100a);

    /* renamed from: d  reason: collision with root package name */
    final h f113095d = i.a((h.f.a.a) e.f113104a);

    /* renamed from: e  reason: collision with root package name */
    final h f113096e = i.a((h.f.a.a) b.f113101a);

    /* renamed from: f  reason: collision with root package name */
    public final int f113097f;

    /* renamed from: g  reason: collision with root package name */
    public final String f113098g;

    /* renamed from: h  reason: collision with root package name */
    public final String f113099h;

    static {
        Covode.recordClassIndex(72710);
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.c.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113100a = new a();

        static {
            Covode.recordClassIndex(72711);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.c.a invoke() {
            return new com.ss.android.ugc.aweme.notification.c.a();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.c.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113101a = new b();

        static {
            Covode.recordClassIndex(72712);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.c.c invoke() {
            return new com.ss.android.ugc.aweme.notification.c.c();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.c.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113102a = new c();

        static {
            Covode.recordClassIndex(72713);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.c.d invoke() {
            return new com.ss.android.ugc.aweme.notification.c.d();
        }
    }

    public static final class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f113103a;

        static {
            Covode.recordClassIndex(72714);
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final List<BaseNotice> a(List<BaseNotice> list) {
            h.f.b.l.d(list, "");
            return list;
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final String c() {
            return "";
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final String a() {
            return this.f113103a.f113098g;
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final String b() {
            return f.a.a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(l lVar) {
            this.f113103a = lVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final RecyclerView.ViewHolder a(ViewGroup viewGroup) {
            h.f.b.l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.l5, viewGroup, false);
            h.f.b.l.b(a2, "");
            x xVar = new x(a2);
            xVar.f113738a = this.f113103a.b();
            return xVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.a.f
        public final void a(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i2, HashMap<String, BaseNotice> hashMap) {
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(baseNotice, "");
            h.f.b.l.d(hashMap, "");
            if ((baseNotice instanceof MusNotice) && (viewHolder instanceof x)) {
                x xVar = (x) viewHolder;
                MusNotice musNotice = (MusNotice) baseNotice;
                String str = this.f113103a.f113099h;
                l lVar = this.f113103a;
                int i3 = baseNotice.type;
                ArrayList arrayList = new ArrayList();
                if (i3 == 6) {
                    arrayList.add(lVar.f113093b.getValue());
                } else if (i3 == 212) {
                    arrayList.add(lVar.f113094c.getValue());
                } else if (i3 == 215) {
                    arrayList.add(lVar.f113095d.getValue());
                } else if (i3 == 218) {
                    arrayList.add(lVar.f113096e.getValue());
                }
                xVar.a(musNotice, i2, "", str, "", true, (List<? extends com.ss.android.ugc.aweme.notification.view.template.c>) arrayList);
            }
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.notification.c.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113104a = new e();

        static {
            Covode.recordClassIndex(72715);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.notification.c.f invoke() {
            return new com.ss.android.ugc.aweme.notification.c.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.a.c
    public final f a() {
        return new d(this);
    }

    public l(int i2, String str, String str2) {
        h.f.b.l.d(str, "");
        this.f113097f = i2;
        this.f113098g = str;
        this.f113099h = str2;
    }
}
