package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.tools.utils.q;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import com.ss.ugc.effectplatform.algorithm.e;
import h.f.b.l;
import java.net.URI;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f128743a = new m();

    public interface a {
        static {
            Covode.recordClassIndex(84384);
        }

        void a(Exception exc);

        void a(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(84385);
        }

        void a(boolean z);

        void a(boolean z, int i2, Exception exc);
    }

    private m() {
    }

    static {
        Covode.recordClassIndex(84383);
    }

    public static final class c implements IFetchResourceListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f128760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f128761b;

        static {
            Covode.recordClassIndex(84386);
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            l.d(exc, "");
            a aVar = this.f128761b;
            if (aVar != null) {
                aVar.a(exc);
            }
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j2) {
            String findResourceUri;
            if (!UseKNPlatform.enableKNPlatform || !e.a.b()) {
                findResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, this.f128760a);
            } else {
                AlgorithmModelResourceFinder a2 = e.a.a().a();
                String str = this.f128760a;
                l.b(str, "");
                findResourceUri = a2.realFindResourceUri(0, null, str);
            }
            if (TextUtils.isEmpty(findResourceUri)) {
                a aVar = this.f128761b;
                if (aVar != null) {
                    aVar.a("");
                    return;
                }
                return;
            }
            URI create = URI.create(findResourceUri);
            l.b(create, "");
            String path = create.getPath();
            a aVar2 = this.f128761b;
            if (aVar2 != null) {
                l.b(path, "");
                aVar2.a(path);
            }
        }

        public c(String str, a aVar) {
            this.f128760a = str;
            this.f128761b = aVar;
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ASCameraView f128764a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f128765b;

        static {
            Covode.recordClassIndex(84387);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.m.a
        public final void a(Exception exc) {
            l.d(exc, "");
            q.b("aec model download fail:" + Log.getStackTraceString(exc));
            b bVar = this.f128765b;
            if (bVar != null) {
                bVar.a(false, -1, exc);
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.m.a
        public final void a(String str) {
            boolean z;
            l.d(str, "");
            q.a("aec model download success");
            boolean z2 = false;
            if (com.ss.android.ugc.aweme.video.e.b(str)) {
                ASCameraView aSCameraView = this.f128764a;
                l.d(str, "");
                if (aSCameraView.f62345d != null) {
                    com.ss.android.ugc.asve.recorder.a aVar = aSCameraView.f62345d;
                    if (aVar == null) {
                        l.a("recorder");
                    }
                    z = aVar.f().a(true, str);
                } else {
                    z = false;
                }
                b bVar = this.f128765b;
                if (bVar != null) {
                    bVar.a(true, 0, null);
                }
                z2 = z;
            } else {
                b bVar2 = this.f128765b;
                if (bVar2 != null) {
                    bVar2.a(false, -1, null);
                }
            }
            q.a("aec model download success status:".concat(String.valueOf(z2)));
            b bVar3 = this.f128765b;
            if (bVar3 != null) {
                bVar3.a(z2);
            }
        }

        public d(ASCameraView aSCameraView, b bVar) {
            this.f128764a = aSCameraView;
            this.f128765b = bVar;
        }
    }
}
