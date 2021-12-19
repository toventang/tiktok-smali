package com.ss.android.ugc.aweme.base.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.livewallpaper.f.e;

final class s implements e {

    /* renamed from: a  reason: collision with root package name */
    private Context f68024a;

    /* renamed from: b  reason: collision with root package name */
    private Keva f68025b;

    static {
        Covode.recordClassIndex(41900);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final int a() {
        return this.f68025b.getInt("current_video_width", 0);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final int b() {
        return this.f68025b.getInt("current_video_height", 0);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final float c() {
        return this.f68025b.getFloat("volume", 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final boolean d() {
        return this.f68025b.getBoolean("should_mute", false);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void a(float f2) {
        this.f68025b.storeFloat("volume", f2);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void b(int i2) {
        this.f68025b.storeInt("current_video_height", i2);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void d(String str) {
        this.f68025b.storeString("current_video_path", str);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void f(String str) {
        this.f68025b.storeString("source", str);
    }

    public s(Context context) {
        this.f68024a = context;
        this.f68025b = Keva.getRepoFromSp(context, "LiveWallPaper", 0);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final String e(String str) {
        return this.f68025b.getString("source", str);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final String a(String str) {
        return this.f68025b.getString("live_wall_paper_list", str);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void b(String str) {
        this.f68025b.storeString("live_wall_paper_list", str);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final String c(String str) {
        return this.f68025b.getString("current_video_path", str);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void a(int i2) {
        this.f68025b.storeInt("current_video_width", i2);
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.f.e
    public final void a(boolean z) {
        this.f68025b.storeBoolean("should_mute", z);
    }
}
