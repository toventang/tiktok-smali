package com.ss.android.ugc.aweme.video.local;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;
import com.google.c.a.k;
import com.google.c.e.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class LocalVideoPlayerManager implements au {

    /* renamed from: b  reason: collision with root package name */
    private static final String f143441b = LocalVideoPlayerManager.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static LocalVideoPlayerManager f143442c;

    /* renamed from: a  reason: collision with root package name */
    public b f143443a = new b();

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f143444d = new AtomicBoolean(false);

    public interface a {
        static {
            Covode.recordClassIndex(93866);
        }

        void a();

        void a(String str);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public final boolean a(String str, String str2, a aVar) {
        String b2 = b(str);
        boolean z = !TextUtils.isEmpty(b2);
        if (z) {
            b.i.b(new c(b2, str2), b.i.f4824a).a(new d(aVar, str2), b.i.f4826c, null);
        }
        return z;
    }

    static {
        Covode.recordClassIndex(93864);
    }

    private static boolean e() {
        return b.a().a(true, "is_local_video_play_enable", true);
    }

    private LocalVideoPlayerManager() {
    }

    public static LocalVideoPlayerManager a() {
        MethodCollector.i(9269);
        if (f143442c == null) {
            synchronized (LocalVideoPlayerManager.class) {
                try {
                    if (f143442c == null) {
                        f143442c = new LocalVideoPlayerManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9269);
                    throw th;
                }
            }
        }
        LocalVideoPlayerManager localVideoPlayerManager = f143442c;
        MethodCollector.o(9269);
        return localVideoPlayerManager;
    }

    private Map<String, e> d() {
        try {
            String string = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_local_video", 0).getString("extra_data", null);
            if (!TextUtils.isEmpty(string)) {
                return (Map) e.a.f9628b.a(string, new com.google.gson.b.a<HashMap<String, e>>() {
                    /* class com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(93865);
                    }
                }.type);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b() {
        try {
            c();
            SharedPreferences a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_local_video", 0);
            a2.edit().putString("extra_data", e.a.f9628b.b(this.f143443a.f143459a)).apply();
        } catch (Throwable unused) {
        }
    }

    public final void c() {
        MethodCollector.i(9457);
        if (!e()) {
            MethodCollector.o(9457);
        } else if (!this.f143444d.get()) {
            Map<String, e> d2 = d();
            synchronized (this) {
                try {
                    if (this.f143444d.compareAndSet(false, true) && d2 != null && !d2.isEmpty()) {
                        this.f143443a.a(d2.values());
                    }
                } finally {
                    MethodCollector.o(9457);
                }
            }
        } else {
            MethodCollector.o(9457);
        }
    }

    private static e a(Aweme aweme) {
        return a(aweme.getAid(), aweme.getAuthorUid(), aweme.isVr(), aweme.getVideo());
    }

    private String b(String str) {
        c();
        if (!a(str)) {
            return null;
        }
        e a2 = this.f143443a.a(str);
        if (a2 == null) {
            return "";
        }
        return a2.localPath;
    }

    private boolean a(String str) {
        e a2;
        if (TextUtils.isEmpty(str) || !e() || (a2 = this.f143443a.a(str)) == null || !TextUtils.equals(a2.authorId, com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
            return false;
        }
        if (!b.b(this.f143443a.a(str))) {
            return true;
        }
        this.f143443a.b(str);
        return false;
    }

    public final String a(VideoUrlModel videoUrlModel) {
        e a2;
        String b2 = b(videoUrlModel.getSourceId());
        if (TextUtils.isEmpty(b2) || (a2 = this.f143443a.a(videoUrlModel.getSourceId())) == null) {
            return b2;
        }
        String uri = a2.getUri();
        String uri2 = videoUrlModel.getUri();
        if (uri == null || uri2 == null || TextUtils.equals(uri.split("_")[0], uri2.split("_")[0])) {
            return b2;
        }
        this.f143443a.b(a2.getSourceId());
        return null;
    }

    static final /* synthetic */ Object a(String str, String str2) {
        boolean z;
        File file = new File(str);
        File file2 = new File(str2);
        try {
            if (!file.equals(file2)) {
                z = true;
            } else {
                z = false;
            }
            k.a(z, "Source %s and destination %s must be different", file, file2);
            new f.b(file, (byte) 0).a(new f.a(file2, new com.google.c.e.e[0], (byte) 0));
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            b.i.a((Exception) e2);
            return null;
        }
    }

    public final void a(String str, Aweme aweme) {
        if (e() && aweme != null) {
            c();
            e a2 = a(aweme);
            a2.localPath = str;
            this.f143443a.a(a2);
            b();
        }
    }

    private static e a(String str, String str2, boolean z, Video video) {
        boolean z2;
        e eVar = new e(str);
        eVar.authorId = str2;
        eVar.setVr(z);
        if (video != null) {
            eVar.setDuration((double) video.getDuration());
            eVar.setWidth(video.getWidth());
            eVar.setHeight(video.getHeight());
            if (video.getProperPlayAddr() != null) {
                eVar.setUri(video.getProperPlayAddr().getUri());
                if (video.getPlayAddrBytevc1() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                eVar.setBytevc1(z2);
            }
        }
        return eVar;
    }
}
