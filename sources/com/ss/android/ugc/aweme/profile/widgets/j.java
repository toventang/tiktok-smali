package com.ss.android.ugc.aweme.profile.widgets;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.user.c;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class j implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final a f117891f = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final Keva f117892h = Keva.getRepo("check_multi_account_repo");

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<b> f117893a;

    /* renamed from: b  reason: collision with root package name */
    public final c f117894b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f117895c;

    /* renamed from: d  reason: collision with root package name */
    public final e f117896d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.profile.e.a f117897e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f117898g;

    public interface b {
        static {
            Covode.recordClassIndex(76394);
        }

        void a(Boolean bool);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76393);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(76392);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.j.onClick(android.view.View):void");
    }

    public j(WeakReference<b> weakReference, c cVar, Context context, e eVar, com.ss.android.ugc.aweme.profile.e.a aVar) {
        l.d(weakReference, "");
        l.d(cVar, "");
        l.d(context, "");
        l.d(eVar, "");
        l.d(aVar, "");
        this.f117893a = weakReference;
        this.f117894b = cVar;
        this.f117895c = context;
        this.f117896d = eVar;
        this.f117897e = aVar;
    }
}
