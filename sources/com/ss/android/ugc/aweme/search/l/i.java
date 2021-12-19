package com.ss.android.ugc.aweme.search.l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.lynx.d.c;
import com.ss.android.ugc.aweme.discover.mixfeed.lynx.b;
import com.ss.android.ugc.aweme.discover.mixfeed.lynx.c;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class i {

    /* renamed from: f  reason: collision with root package name */
    public static volatile AtomicInteger f121401f = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public a f121402a;

    /* renamed from: b  reason: collision with root package name */
    public h f121403b;

    /* renamed from: c  reason: collision with root package name */
    public h f121404c;

    /* renamed from: d  reason: collision with root package name */
    public h f121405d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f121406e = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f121407g;

    public interface a {
        static {
            Covode.recordClassIndex(79103);
        }

        RecyclerView.ViewHolder b(ViewGroup viewGroup);

        RecyclerView.ViewHolder c(ViewGroup viewGroup);

        RecyclerView.ViewHolder d(ViewGroup viewGroup);
    }

    public static void b() {
        f121401f.compareAndSet(1, 2);
    }

    public final void a() {
        this.f121404c.a(2);
    }

    static {
        Covode.recordClassIndex(79096);
    }

    public i(final ViewGroup viewGroup, final a aVar) {
        this.f121407g = viewGroup;
        this.f121402a = aVar;
        this.f121403b = new h(this.f121406e) {
            /* class com.ss.android.ugc.aweme.search.l.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79097);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.search.l.h
            public final RecyclerView.ViewHolder a() {
                return aVar.c(viewGroup);
            }
        };
        this.f121404c = new h(this.f121406e) {
            /* class com.ss.android.ugc.aweme.search.l.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(79098);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.search.l.h
            public final RecyclerView.ViewHolder a() {
                return aVar.d(viewGroup);
            }
        };
        this.f121405d = new h(this.f121406e) {
            /* class com.ss.android.ugc.aweme.search.l.i.AnonymousClass3 */

            static {
                Covode.recordClassIndex(79099);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.search.l.h
            public final RecyclerView.ViewHolder a() {
                return aVar.b(viewGroup);
            }
        };
    }

    public static void a(Context context, String str, com.ss.android.ugc.aweme.discover.mixfeed.lynx.a aVar) {
        c cVar;
        List<b> list;
        String str2;
        if (!(aVar == null || (cVar = aVar.f81814a) == null || (list = cVar.f81819a) == null || aVar.f81815b == null || !TextUtils.equals(str, aVar.f81815b.getRequestKeyword()))) {
            aVar.f81815b.getRequestKeyword();
            list.size();
            for (b bVar : list) {
                if (TextUtils.isEmpty(bVar.f81816a)) {
                    str2 = bVar.f81818c;
                } else {
                    str2 = bVar.f81816a;
                }
                if (str2 != null) {
                    c.a.a(str2, 2);
                    com.ss.android.ugc.aweme.discover.lynx.b.b.f81440b.a(context, str2, bVar.f81817b);
                }
            }
        }
    }
}
