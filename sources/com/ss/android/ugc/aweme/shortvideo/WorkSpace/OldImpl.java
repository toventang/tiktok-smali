package com.ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.v;
import com.ss.android.ugc.tools.utils.i;
import java.io.File;

public class OldImpl implements WorkspaceImpl, a {
    public static final Parcelable.Creator<OldImpl> CREATOR = new Parcelable.Creator<OldImpl>() {
        /* class com.ss.android.ugc.aweme.shortvideo.WorkSpace.OldImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(81992);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OldImpl[] newArray(int i2) {
            return new OldImpl[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OldImpl createFromParcel(Parcel parcel) {
            return new OldImpl(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    int f124777a;

    /* renamed from: b  reason: collision with root package name */
    String f124778b = dj.f126462e;

    /* renamed from: c  reason: collision with root package name */
    String f124779c;

    /* renamed from: d  reason: collision with root package name */
    String f124780d;

    /* renamed from: e  reason: collision with root package name */
    String f124781e;

    /* renamed from: f  reason: collision with root package name */
    String f124782f;

    /* renamed from: g  reason: collision with root package name */
    String f124783g;

    /* renamed from: h  reason: collision with root package name */
    String f124784h;

    /* renamed from: i  reason: collision with root package name */
    String f124785i;

    /* renamed from: j  reason: collision with root package name */
    String f124786j;

    /* renamed from: k  reason: collision with root package name */
    String f124787k;

    /* renamed from: l  reason: collision with root package name */
    String f124788l;

    /* renamed from: m  reason: collision with root package name */
    String f124789m;
    String n;
    String o;
    Workspace p;
    public Handler q = new Handler(Looper.getMainLooper());

    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final String c() {
        return this.f124783g;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File d() {
        return new File(this.f124778b);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void e() {
        this.f124783g = null;
        this.o = null;
    }

    static {
        Covode.recordClassIndex(81991);
    }

    public OldImpl() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File a() {
        if (this.f124780d == null) {
            this.f124780d = dj.a("-concat-v");
        }
        return new File(this.f124780d);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File b() {
        if (TextUtils.isEmpty(this.f124781e)) {
            this.f124781e = dj.a("-concat-a");
        }
        return new File(this.f124781e);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void g() {
        if (d().exists()) {
            i.a(d());
        }
        f();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File h() {
        if (this.f124786j == null) {
            this.f124786j = v.a(a().getPath());
        }
        return new File(this.f124786j);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File i() {
        if (this.f124787k == null) {
            this.f124787k = v.b(b().getPath());
        }
        return new File(this.f124787k);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File j() {
        if (this.f124788l == null) {
            this.f124788l = v.c(a().getPath());
        }
        return new File(this.f124788l);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void f() {
        if (this.f124785i == null) {
            this.f124785i = new File(this.f124783g + ".wav").getPath();
        }
        File file = new File(this.f124785i);
        if (file.exists()) {
            a(file);
        }
        if (this.f124784h == null) {
            this.f124784h = new File(dj.f126461d, "mix.wav").getPath();
        }
        File file2 = new File(this.f124784h);
        if (file2.exists()) {
            a(file2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.a
    public final void a(Workspace workspace) {
        this.p = workspace;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void a(String str) {
        this.f124778b = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final void b(String str) {
        e();
        this.f124783g = str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File c(String str) {
        String str2 = dj.f126465h;
        if (!i.a(str2)) {
            i.a(str2, false);
        }
        this.f124789m = str2 + dj.b("-bgv-v");
        return new File(this.f124789m);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.WorkSpace.WorkspaceImpl
    public final File d(String str) {
        String str2 = dj.f126465h;
        if (!i.a(str2)) {
            i.a(str2, false);
        }
        this.n = str2 + dj.b("-bgv-a");
        return new File(this.n);
    }

    protected OldImpl(Parcel parcel) {
        this.f124777a = parcel.readInt();
        this.f124778b = parcel.readString();
        this.f124779c = parcel.readString();
        this.f124780d = parcel.readString();
        this.f124781e = parcel.readString();
        this.f124782f = parcel.readString();
        this.f124783g = parcel.readString();
        this.f124785i = parcel.readString();
        this.f124784h = parcel.readString();
        this.f124786j = parcel.readString();
        this.o = parcel.readString();
    }

    private static boolean a(File file) {
        MethodCollector.i(12242);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(12242);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12242);
        return delete;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f124777a);
        parcel.writeString(this.f124778b);
        parcel.writeString(this.f124779c);
        parcel.writeString(this.f124780d);
        parcel.writeString(this.f124781e);
        parcel.writeString(this.f124782f);
        parcel.writeString(this.f124783g);
        parcel.writeString(this.f124785i);
        parcel.writeString(this.f124784h);
        parcel.writeString(this.f124786j);
        parcel.writeString(this.o);
    }
}
