package com.ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class Workspace implements Parcelable {
    public static final Parcelable.Creator<Workspace> CREATOR = new Parcelable.Creator<Workspace>() {
        /* class com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace.AnonymousClass1 */

        static {
            Covode.recordClassIndex(81994);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Workspace[] newArray(int i2) {
            return new Workspace[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Workspace createFromParcel(Parcel parcel) {
            return new Workspace(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final WorkspaceImpl f124790a;

    public final int describeContents() {
        return 0;
    }

    public final File a() {
        return this.f124790a.a();
    }

    public final File b() {
        return this.f124790a.b();
    }

    public final String c() {
        return this.f124790a.c();
    }

    public final void d() {
        this.f124790a.e();
    }

    public final File e() {
        return this.f124790a.d();
    }

    public final void f() {
        this.f124790a.f();
    }

    public final void g() {
        this.f124790a.g();
    }

    public final File h() {
        return this.f124790a.h();
    }

    public final File i() {
        return this.f124790a.i();
    }

    public final File j() {
        return this.f124790a.j();
    }

    static {
        Covode.recordClassIndex(81993);
    }

    public Workspace(WorkspaceImpl workspaceImpl) {
        this.f124790a = workspaceImpl;
    }

    public final void a(String str) {
        this.f124790a.b(str);
    }

    public final void b(String str) {
        this.f124790a.a(str);
    }

    protected Workspace(Parcel parcel) {
        WorkspaceImpl workspaceImpl = (WorkspaceImpl) parcel.readParcelable(WorkspaceImpl.class.getClassLoader());
        this.f124790a = workspaceImpl;
        if (workspaceImpl instanceof a) {
            ((a) workspaceImpl).a(this);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f124790a, i2);
    }
}
