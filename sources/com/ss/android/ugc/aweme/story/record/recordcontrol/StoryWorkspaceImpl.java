package com.ss.android.ugc.aweme.story.record.recordcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.aweme.story.base.b.b;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import java.io.File;

public final class StoryWorkspaceImpl implements WorkspaceImpl, com.ss.android.ugc.aweme.shortvideo.WorkSpace.a {
    public static final a CREATOR = new a((byte) 0);
    private static int p;
    private static int q;

    /* renamed from: a  reason: collision with root package name */
    private String f138406a;

    /* renamed from: b  reason: collision with root package name */
    private String f138407b;

    /* renamed from: c  reason: collision with root package name */
    private String f138408c;

    /* renamed from: d  reason: collision with root package name */
    private String f138409d;

    /* renamed from: e  reason: collision with root package name */
    private String f138410e;

    /* renamed from: f  reason: collision with root package name */
    private String f138411f;

    /* renamed from: g  reason: collision with root package name */
    private String f138412g;

    /* renamed from: h  reason: collision with root package name */
    private String f138413h;

    /* renamed from: i  reason: collision with root package name */
    private String f138414i;

    /* renamed from: j  reason: collision with root package name */
    private String f138415j;

    /* renamed from: k  reason: collision with root package name */
    private String f138416k;

    /* renamed from: l  reason: collision with root package name */
    private String f138417l;

    /* renamed from: m  reason: collision with root package name */
    private String f138418m;
    private Workspace n;
    private String o;

    static {
        Covode.recordClassIndex(90517);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<StoryWorkspaceImpl> {
        static {
            Covode.recordClassIndex(90518);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryWorkspaceImpl[] newArray(int i2) {
            return new StoryWorkspaceImpl[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryWorkspaceImpl createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StoryWorkspaceImpl(parcel);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final String c() {
        return this.f138410e;
    }

    private final String k() {
        return b.a(this.o, null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void e() {
        this.f138410e = null;
        this.f138418m = null;
    }

    private final String l() {
        if (this.f138406a == null) {
            this.f138406a = b.a(this.o, "record");
        }
        return this.f138406a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File d() {
        String l2 = l();
        if (l2 == null || l2.length() == 0) {
            return null;
        }
        return new File(l());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void g() {
        File d2 = d();
        if (d2 != null && d2.exists()) {
            i.a(d());
        }
        f();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File h() {
        if (this.f138413h == null) {
            String path = a().getPath();
            l.b(path, "");
            this.f138413h = v.a(path);
        }
        String str = this.f138413h;
        if (str == null) {
            l.b();
        }
        return new File(str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File i() {
        if (this.f138414i == null) {
            String path = b().getPath();
            l.b(path, "");
            this.f138414i = v.b(path);
        }
        String str = this.f138414i;
        if (str == null) {
            l.b();
        }
        return new File(str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File j() {
        if (this.f138415j == null) {
            String path = a().getPath();
            l.b(path, "");
            this.f138415j = v.c(path);
        }
        String str = this.f138415j;
        if (str == null) {
            l.b();
        }
        return new File(str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File b() {
        if (this.f138408c == null) {
            StringBuilder append = new StringBuilder().append(k());
            StringBuilder sb = new StringBuilder("-");
            int i2 = q;
            q = i2 + 1;
            this.f138408c = append.append(dj.b(sb.append(i2).append("-concat-a").toString())).toString();
        }
        String str = this.f138408c;
        if (str == null) {
            l.b();
        }
        return new File(str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void f() {
        if (this.f138412g == null) {
            this.f138412g = new File(this.f138410e + ".wav").getPath();
        }
        String str = this.f138412g;
        if (str == null) {
            l.b();
        }
        File file = new File(str);
        if (file.exists()) {
            a(file);
        }
        if (this.f138411f == null) {
            this.f138411f = new File(k(), "mix.wav").getPath();
        }
        String str2 = this.f138411f;
        if (str2 == null) {
            l.b();
        }
        File file2 = new File(str2);
        if (file2.exists()) {
            a(file2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File a() {
        if (this.f138407b == null) {
            StringBuilder append = new StringBuilder().append(k());
            StringBuilder sb = new StringBuilder("-");
            int i2 = p;
            p = i2 + 1;
            this.f138407b = append.append(dj.b(sb.append(i2).append("-concat-v").toString())).toString();
        }
        String str = this.f138407b;
        if (str == null) {
            l.b();
        }
        return new File(str);
    }

    public StoryWorkspaceImpl(String str) {
        this.o = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.a
    public final void a(Workspace workspace) {
        l.d(workspace, "");
        this.n = workspace;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void b(String str) {
        e();
        this.f138410e = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void a(String str) {
        if (str == null) {
            str = l();
        }
        this.f138406a = str;
    }

    public final void e(String str) {
        this.o = str;
        this.f138406a = b.a(str, "record");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryWorkspaceImpl(Parcel parcel) {
        this(parcel.readString());
        l.d(parcel, "");
        this.f138407b = parcel.readString();
        this.f138408c = parcel.readString();
        this.f138409d = parcel.readString();
        this.f138410e = parcel.readString();
        this.f138412g = parcel.readString();
        this.f138411f = parcel.readString();
        this.f138413h = parcel.readString();
        this.f138418m = parcel.readString();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File c(String str) {
        l.d(str, "");
        String a2 = b.a(this.o, "background_video");
        if (!i.a(a2)) {
            i.a(a2, false);
        }
        this.f138416k = a2 + dj.b("-bgv-v");
        String str2 = this.f138416k;
        if (str2 == null) {
            l.b();
        }
        return new File(str2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File d(String str) {
        l.d(str, "");
        String a2 = b.a(this.o, "background_video");
        if (!i.a(a2)) {
            i.a(a2, false);
        }
        this.f138417l = a2 + dj.b("-bgv-a");
        String str2 = this.f138417l;
        if (str2 == null) {
            l.b();
        }
        return new File(str2);
    }

    private static boolean a(File file) {
        MethodCollector.i(2135);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2135);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2135);
        return delete;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.o);
        parcel.writeString(this.f138407b);
        parcel.writeString(this.f138408c);
        parcel.writeString(this.f138409d);
        parcel.writeString(this.f138410e);
        parcel.writeString(this.f138412g);
        parcel.writeString(this.f138411f);
        parcel.writeString(this.f138413h);
        parcel.writeString(this.f138418m);
    }
}
