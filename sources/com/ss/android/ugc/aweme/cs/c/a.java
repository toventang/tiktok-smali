package com.ss.android.ugc.aweme.cs.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.b.b;
import com.ss.android.ugc.aweme.cs.h.c;
import com.ss.android.ugc.aweme.shortvideo.dj;
import h.f.b.l;
import h.n;
import java.io.File;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final C1837a f79000a = new C1837a((byte) 0);

    static {
        Covode.recordClassIndex(49032);
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.c.a$a  reason: collision with other inner class name */
    public static final class C1837a {
        static {
            Covode.recordClassIndex(49033);
        }

        private C1837a() {
        }

        public /* synthetic */ C1837a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final String a(String str) {
        return a(com.ss.android.ugc.aweme.cs.b.a.SHOOT, str);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final String b(String str) {
        return a(com.ss.android.ugc.aweme.cs.b.a.VIDEOCUT, str);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final String c(String str) {
        return a(com.ss.android.ugc.aweme.cs.b.a.PUBLISH, str);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final String d(String str) {
        return a(b.CACHE, str);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final String e(String str) {
        return a(b.RESOURCE, str);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final String f(String str) {
        return a(b.STORY, str);
    }

    private static boolean a(File file) {
        l.d(file, "");
        com.ss.android.ugc.aweme.cs.d.b.b();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final File g(String str) {
        l.d(str, "");
        File file = new File(str);
        a(file);
        file.getPath();
        file.exists();
        return file;
    }

    @Override // com.ss.android.ugc.aweme.cs.h.c
    public final File a(File file, String str) {
        l.d(file, "");
        l.d(str, "");
        File file2 = new File(file, str);
        a(file2);
        file2.getPath();
        file2.exists();
        return file2;
    }

    private static String a(com.ss.android.ugc.aweme.cs.b.a aVar, String str) {
        String str2;
        l.d(aVar, "");
        int i2 = b.f79001a[aVar.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            str2 = "shoot";
        } else if (i2 == 2) {
            str2 = "videoedit";
        } else if (i2 == 3) {
            str2 = "videocut";
        } else if (i2 == 4) {
            str2 = "publish";
        } else {
            throw new n();
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            return dj.f126461d + "shortvideo/" + str2 + '/';
        }
        return dj.f126461d + "shortvideo/" + str2 + '/' + str + '/';
    }

    private static String a(b bVar, String str) {
        String str2;
        l.d(bVar, "");
        int i2 = b.f79002b[bVar.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            str2 = "cache";
        } else if (i2 == 2) {
            str2 = "resources";
        } else if (i2 == 3) {
            str2 = "draft";
        } else if (i2 == 4) {
            str2 = "story";
        } else {
            throw new n();
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z) {
            return dj.f126461d + "shortvideo/" + str2 + '/';
        }
        return dj.f126461d + "shortvideo/" + str2 + '/' + str + '/';
    }
}
