package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.video.e;
import h.f.b.l;
import java.util.ArrayList;

public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f125902j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Context f125903a;

    /* renamed from: b  reason: collision with root package name */
    public int f125904b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<String> f125905c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    final ArrayList<String> f125906d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    AbstractC3277b f125907e;

    /* renamed from: f  reason: collision with root package name */
    ea f125908f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f125909g;

    /* renamed from: h  reason: collision with root package name */
    final ArrayList<String> f125910h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public final d f125911i = new d(this, Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b$b  reason: collision with other inner class name */
    public interface AbstractC3277b {
        static {
            Covode.recordClassIndex(82724);
        }

        void a(ea eaVar, boolean z);
    }

    static {
        Covode.recordClassIndex(82722);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82723);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (this.f125904b >= this.f125905c.size()) {
            AbstractC3277b bVar = this.f125907e;
            if (bVar != null) {
                bVar.a(this.f125908f, this.f125909g);
            }
            this.f125911i.removeCallbacksAndMessages(null);
            return;
        }
        String str = this.f125905c.get(this.f125904b);
        String str2 = this.f125906d.get(this.f125904b);
        String str3 = this.f125910h.get(this.f125904b);
        l.b(str3, "");
        String str4 = str3;
        if (TextUtils.isEmpty(str)) {
            this.f125911i.sendEmptyMessage(1);
        } else if (e.b(str2)) {
            this.f125909g |= true;
            this.f125911i.sendEmptyMessage(1);
        } else {
            a.a(this.f125903a, this.f125905c.get(this.f125904b), this.f125906d.get(this.f125904b), new c(this, str, str4));
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f125912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f125914c;

        static {
            Covode.recordClassIndex(82725);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a
        public final void onSuccessed(DownloadInfo downloadInfo) {
            this.f125912a.f125911i.sendEmptyMessage(1);
            this.f125912a.f125909g = true;
            i.a(true, this.f125913b, this.f125914c, null);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            this.f125912a.f125911i.sendEmptyMessage(1);
            i.a(false, this.f125913b, this.f125914c, baseException);
        }

        c(b bVar, String str, String str2) {
            this.f125912a = bVar;
            this.f125913b = str;
            this.f125914c = str2;
        }
    }

    public static final class d extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f125915a;

        static {
            Covode.recordClassIndex(82726);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            if (message.what == 1) {
                this.f125915a.f125904b++;
                this.f125915a.a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, Looper looper) {
            super(looper);
            this.f125915a = bVar;
        }
    }
}
