package com.ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.ASMediaSegment;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.ss.android.ugc.asve.recorder.c.a;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;
import org.libsdl.app.AudioRecorderInterface;

public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f62385a;

    static {
        Covode.recordClassIndex(38331);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int a(int i2, int i3, String str, int i4, int i5, String str2, int i6, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        return this.f62385a.a(i2, i3, str, i4, i5, str2, i6, z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int a(Context context, AudioRecorderInterface audioRecorderInterface) {
        l.d(context, "");
        return this.f62385a.a(context, audioRecorderInterface);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int a(String str, int i2, int i3, b<? super Integer, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        return this.f62385a.a(str, i2, i3, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(double d2, boolean z, float f2, int i2, int i3, boolean z2, b<? super Integer, z> bVar) {
        l.d(bVar, "");
        this.f62385a.a(d2, z, f2, i2, i3, z2, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f62385a.a(i2, vESafeAreaParamsArr);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(long j2) {
        this.f62385a.a(j2);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(Surface surface) {
        this.f62385a.a(surface);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(Surface surface, String str, b<? super Integer, z> bVar) {
        l.d(surface, "");
        l.d(str, "");
        this.f62385a.a(surface, str, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(PrivacyCert privacyCert) {
        this.f62385a.a(privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(com.ss.android.ugc.asve.a.b bVar) {
        this.f62385a.a(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(VEListener.j jVar) {
        this.f62385a.a(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(ax.h hVar) {
        l.d(hVar, "");
        this.f62385a.a(hVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(b<? super Integer, z> bVar) {
        this.f62385a.a(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(b<? super Integer, z> bVar, h.f.a.a<z> aVar) {
        this.f62385a.a(bVar, aVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, double d2, b<? super Integer, z> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        this.f62385a.a(str, d2, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, int i2, int i3, boolean z, Bitmap.CompressFormat compressFormat, b<? super Integer, z> bVar, boolean z2) {
        l.d(str, "");
        l.d(compressFormat, "");
        l.d(bVar, "");
        this.f62385a.a(str, i2, i3, z, compressFormat, bVar, z2);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, long j2, long j3, boolean z) {
        this.f62385a.a(str, j2, j3, z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(String str, String str2, boolean z, String str3, String str4, b<? super RecorderConcatResult, z> bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f62385a.a(str, str2, z, str3, str4, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(List<ASMediaSegment> list, String str, String str2, int i2, VEListener.j jVar) {
        l.d(list, "");
        l.d(str, "");
        l.d(jVar, "");
        this.f62385a.a(list, str, str2, i2, jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(boolean z) {
        this.f62385a.a(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(boolean z, PrivacyCert privacyCert) {
        this.f62385a.a(z, privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void a(boolean z, b<? super Integer, z> bVar) {
        this.f62385a.a(z, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean a() {
        return this.f62385a.a();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean a(boolean z, String str) {
        l.d(str, "");
        return this.f62385a.a(z, str);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int b() {
        return this.f62385a.b();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int b(Context context, AudioRecorderInterface audioRecorderInterface) {
        l.d(context, "");
        return this.f62385a.b(context, audioRecorderInterface);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void b(Surface surface, String str, b<? super Integer, z> bVar) {
        l.d(surface, "");
        l.d(str, "");
        this.f62385a.b(surface, str, bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void b(VEListener.j jVar) {
        this.f62385a.b(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean b(boolean z) {
        return this.f62385a.b(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void c() {
        this.f62385a.c();
    }

    @Override // com.ss.android.ugc.asve.recorder.a.b
    public final void c(PrivacyCert privacyCert) {
        this.f62385a.c(privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void c(VEListener.j jVar) {
        l.d(jVar, "");
        this.f62385a.c(jVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void c(boolean z) {
        this.f62385a.c(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final long d() {
        return this.f62385a.d();
    }

    @Override // com.ss.android.ugc.asve.recorder.a.b
    public final void d(PrivacyCert privacyCert) {
        this.f62385a.d(privacyCert);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void d(boolean z) {
        this.f62385a.d(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final boolean e() {
        return this.f62385a.e();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final long f() {
        return this.f62385a.f();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void g() {
        this.f62385a.g();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final LiveData<Boolean> h() {
        return this.f62385a.h();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int i() {
        return this.f62385a.i();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int j() {
        return this.f62385a.j();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int k() {
        return this.f62385a.k();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float l() {
        return this.f62385a.l();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int m() {
        return this.f62385a.m();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int n() {
        return this.f62385a.n();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int o() {
        return this.f62385a.o();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float p() {
        return this.f62385a.p();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float q() {
        return this.f62385a.q();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final int r() {
        return this.f62385a.r();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final float[] s() {
        return this.f62385a.s();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final String[] t() {
        return this.f62385a.t();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final void u() {
        this.f62385a.u();
    }

    @Override // com.ss.android.ugc.asve.recorder.c.a
    public final VEMapBufferInfo v() {
        return this.f62385a.v();
    }

    public h(a aVar) {
        l.d(aVar, "");
        this.f62385a = aVar;
    }
}
