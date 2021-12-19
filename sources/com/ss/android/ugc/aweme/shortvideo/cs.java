package com.ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ak;
import com.ss.android.ugc.aweme.shortvideo.ui.c;
import com.ss.android.ugc.aweme.shortvideo.ui.i;
import com.ss.android.ugc.aweme.shortvideo.ui.j;
import h.f.b.l;
import h.f.b.z;
import h.z;

public final class cs {

    /* renamed from: a  reason: collision with root package name */
    public static final a f125307a = new a((byte) 0);

    static {
        Covode.recordClassIndex(82269);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f125308a;

        /* renamed from: b  reason: collision with root package name */
        public String f125309b;

        /* renamed from: c  reason: collision with root package name */
        public int f125310c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f125311d;

        /* renamed from: e  reason: collision with root package name */
        public String f125312e;

        /* renamed from: f  reason: collision with root package name */
        public int f125313f;

        /* renamed from: g  reason: collision with root package name */
        public int f125314g;

        /* renamed from: h  reason: collision with root package name */
        public String f125315h;

        /* renamed from: i  reason: collision with root package name */
        public String f125316i;

        /* renamed from: j  reason: collision with root package name */
        public String f125317j;

        /* renamed from: k  reason: collision with root package name */
        public String f125318k;

        /* renamed from: l  reason: collision with root package name */
        public String f125319l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f125320m;
        public int n;
        public String o;
        public j p;
        public VideoPublishEditModel q;
        public h.f.a.a<z> r;
        public boolean s;
        public boolean t;

        static {
            Covode.recordClassIndex(82271);
        }

        public static final class a implements j {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f125321a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f125322b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.e f125323c;

            static {
                Covode.recordClassIndex(82272);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.ui.j
            public final void a(int i2) {
                j jVar = this.f125321a.p;
                if (jVar != null) {
                    jVar.a(i2);
                }
                if (this.f125322b == null) {
                    try {
                        T t = this.f125323c.element;
                        if (t != null) {
                            t.b();
                        }
                    } catch (Exception unused) {
                    }
                }
            }

            a(b bVar, i iVar, z.e eVar) {
                this.f125321a = bVar;
                this.f125322b = iVar;
                this.f125323c = eVar;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: androidx.fragment.app.Fragment */
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Fragment fragment, i iVar, DialogInterface.OnDismissListener onDismissListener) {
            Fragment fragment2;
            l.d(fragment, "");
            z.e eVar = new z.e();
            eVar.element = null;
            a aVar = new a(this, iVar, eVar);
            boolean z = fragment instanceof com.bytedance.tux.sheet.sheet.a;
            if (this.f125320m) {
                fragment2 = c.a.a(this.f125310c, z, aVar);
            } else {
                ak a2 = ak.a(this.f125308a, this.f125310c, this.f125311d, this.f125312e, this.f125313f, this.f125314g, this.f125315h, this.f125316i, this.f125317j, this.f125318k, this.f125319l, this.f125309b, z, aVar, iVar, this.q, this.t, this.s, this.n, this.o);
                a2.V = this.r;
                l.b(a2, "");
                fragment2 = a2;
            }
            if (z) {
                eVar.element = fragment;
                eVar.element.a(fragment2);
                return;
            }
            a.C1112a a3 = new a.C1112a().a(fragment2);
            if (onDismissListener != null) {
                a3 = a3.a(onDismissListener);
            }
            eVar.element = (T) a3.f45299a;
            eVar.element.show(fragment.getChildFragmentManager(), "PublishPermissionSheet");
        }
    }
}
