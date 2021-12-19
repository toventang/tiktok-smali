package com.ss.android.ugc.aweme.shortvideo.m;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.ugc.effectplatform.algorithm.e;
import h.f.b.l;
import java.io.File;
import java.net.URI;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f128759a = new c();

    public interface a {
        static {
            Covode.recordClassIndex(84391);
        }

        void a();

        void a(String str);
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(84390);
    }

    public static final class b implements IFetchResourceListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f128762a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f128763b;

        static {
            Covode.recordClassIndex(84392);
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            l.d(exc, "");
            a aVar = this.f128763b;
            Log.getStackTraceString(exc);
            aVar.a();
        }

        private static String a(String str) {
            try {
                URI create = URI.create(str);
                l.b(create, "");
                String path = create.getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (new File(path).exists()) {
                        l.b(path, "");
                        return path;
                    }
                }
            } catch (Exception unused) {
            }
            return "";
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j2) {
            String findResourceUri;
            try {
                if (UseKNPlatform.enableKNPlatform) {
                    findResourceUri = e.a.a().a().findResourceUri(this.f128762a);
                } else {
                    findResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, this.f128762a);
                }
                String a2 = a(findResourceUri);
                if (a2.length() == 0) {
                    this.f128763b.a();
                } else {
                    this.f128763b.a(a2);
                }
            } catch (Exception unused) {
                this.f128763b.a();
            }
        }

        public b(String str, a aVar) {
            this.f128762a = str;
            this.f128763b = aVar;
        }
    }
}
