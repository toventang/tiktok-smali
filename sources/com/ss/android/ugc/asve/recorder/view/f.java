package com.ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.presenter.d;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.asve.recorder.effect.a;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.asve.wrap.b;
import com.ss.android.ugc.asve.wrap.c;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.ax;
import com.ss.android.vesdk.bh;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import h.f.b.l;
import java.util.List;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f62384a;

    static {
        Covode.recordClassIndex(38329);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(int i2, float f2) {
        return this.f62384a.a(i2, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(Bitmap bitmap) {
        return this.f62384a.a(bitmap);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(VEEffectFilterParam vEEffectFilterParam) {
        l.d(vEEffectFilterParam, "");
        return this.f62384a.a(vEEffectFilterParam);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String str, float f2, float f3) {
        l.d(str, "");
        return this.f62384a.a(str, f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f62384a.a(str, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f62384a.a(str, str2, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int a(String[] strArr, int i2) {
        l.d(strArr, "");
        return this.f62384a.a(strArr, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a() {
        this.f62384a.a();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(double d2) {
        this.f62384a.a(d2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(double d2, double d3, double d4, double d5) {
        this.f62384a.a(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(float f2) {
        this.f62384a.a(f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(float f2, float f3) {
        this.f62384a.a(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(float f2, float f3, float f4, float f5, float f6) {
        this.f62384a.a(f2, f3, f4, f5, f6);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2) {
        this.f62384a.a(i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, float f2, float f3, int i3) {
        this.f62384a.a(i2, f2, f3, i3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, int i3, ax.d dVar) {
        this.f62384a.a(i2, i3, dVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, long j2, long j3, String str) {
        l.d(str, "");
        this.f62384a.a(i2, j2, j3, str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(int i2, String str) {
        l.d(str, "");
        this.f62384a.a(i2, str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(Context context) {
        l.d(context, "");
        this.f62384a.a(context);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(Context context, String str, String str2) {
        this.f62384a.a(context, str, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(Context context, String str, String str2, String str3) {
        this.f62384a.a(context, str, str2, str3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(MessageCenter.Listener listener) {
        l.d(listener, "");
        this.f62384a.a(listener);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        l.d(onARTextContentCallback, "");
        this.f62384a.a(onARTextContentCallback);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(RecordInvoker.OnARTextCountCallback onARTextCountCallback) {
        l.d(onARTextCountCallback, "");
        this.f62384a.a(onARTextCountCallback);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(RecordInvoker.OnCherEffectParmaCallback onCherEffectParmaCallback) {
        l.d(onCherEffectParmaCallback, "");
        this.f62384a.a(onCherEffectParmaCallback);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f62384a.a(bVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(c cVar) {
        l.d(cVar, "");
        this.f62384a.a(cVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(VEARCoreParam vEARCoreParam) {
        l.d(vEARCoreParam, "");
        this.f62384a.a(vEARCoreParam);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(al alVar) {
        l.d(alVar, "");
        this.f62384a.a(alVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(ax.b bVar, int i2) {
        this.f62384a.a(bVar, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str) {
        this.f62384a.a(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str, float f2) {
        this.f62384a.a(str, f2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str, int i2, int i3, String str2) {
        l.d(str2, "");
        this.f62384a.a(str, i2, i3, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String str, String str2, float f2, float f3, float f4) {
        this.f62384a.a(str, str2, f2, f3, f4);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list) {
        l.d(list, "");
        this.f62384a.a(list);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        this.f62384a.a(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void a(List<ComposerInfo> list, List<ComposerInfo> list2, int i2) {
        l.d(list, "");
        l.d(list2, "");
        this.f62384a.a(list, list2, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(boolean z) {
        this.f62384a.a(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f62384a.a(z, z2, z3, z4);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(double[] dArr, double d2) {
        l.d(dArr, "");
        this.f62384a.a(dArr, d2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f62384a.a(strArr, dArr, zArr);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final boolean a(bh bhVar, int i2) {
        l.d(bhVar, "");
        return this.f62384a.a(bhVar, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final float b(String str) {
        l.d(str, "");
        return this.f62384a.b(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int b(String str, float f2, float f3) {
        l.d(str, "");
        return this.f62384a.b(str, f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int b(String[] strArr, int i2) {
        l.d(strArr, "");
        return this.f62384a.b(strArr, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b() {
        this.f62384a.b();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(double d2, double d3, double d4, double d5) {
        this.f62384a.b(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(float f2, float f3) {
        this.f62384a.b(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(int i2) {
        this.f62384a.b(i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(MessageCenter.Listener listener) {
        l.d(listener, "");
        this.f62384a.b(listener);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(al alVar) {
        l.d(alVar, "");
        this.f62384a.b(alVar);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f62384a.b(str, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void b(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        this.f62384a.b(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void b(boolean z) {
        this.f62384a.b(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final d c() {
        return this.f62384a.c();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(double d2, double d3, double d4, double d5) {
        this.f62384a.c(d2, d3, d4, d5);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(float f2, float f3) {
        this.f62384a.c(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(String str) {
        l.d(str, "");
        this.f62384a.c(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void c(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        this.f62384a.c(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void c(boolean z) {
        this.f62384a.c(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final int[] c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f62384a.c(str, str2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d() {
        this.f62384a.d();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d(float f2, float f3) {
        this.f62384a.d(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d(String str) {
        this.f62384a.d(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void d(List<ComposerInfo> list, int i2) {
        l.d(list, "");
        this.f62384a.d(list, i2);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void d(boolean z) {
        this.f62384a.d(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final VEFrame e(String str) {
        return this.f62384a.e(str);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void e() {
        this.f62384a.e();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void e(float f2, float f3) {
        this.f62384a.e(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void e(boolean z) {
        this.f62384a.e(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void f() {
        this.f62384a.f();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void f(float f2, float f3) {
        this.f62384a.f(f2, f3);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void f(boolean z) {
        this.f62384a.f(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final com.ss.android.ugc.asve.recorder.effect.composer.c g() {
        return this.f62384a.g();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void g(boolean z) {
        this.f62384a.g(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void h() {
        this.f62384a.h();
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.a
    public final void h(boolean z) {
        this.f62384a.h(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.effect.composer.b
    public final void i(boolean z) {
        this.f62384a.i(z);
    }

    public f(a aVar) {
        l.d(aVar, "");
        this.f62384a = aVar;
    }
}
