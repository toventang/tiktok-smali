package com.ss.android.ugc.aweme.livewallpaper.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a {
    static {
        Covode.recordClassIndex(69672);
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.b.a
    public final void e() {
        c(this.f108756h);
        com.ss.android.ugc.aweme.livewallpaper.f.f.b(0, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.b.a
    public final void f() {
        a();
        a.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69673);
            }

            public final void run() {
                if (b.this.f108750b != null && !b.this.f108750b.isFinishing()) {
                    b.this.b();
                    new com.ss.android.ugc.aweme.tux.a.i.a(b.this.f108750b).a(R.string.bbv).a();
                }
            }
        });
    }

    public final void g() {
        a.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(69678);
            }

            public final void run() {
                b.this.b();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.b.a
    public final String d() {
        if (this.f108750b == null || this.f108750b.isFinishing()) {
            return "";
        }
        return this.f108750b.getString(R.string.cyn);
    }

    private void h() {
        if (com.ss.android.ugc.aweme.livewallpaper.f.f.a(this.f108750b, this.f108750b.getPackageName())) {
            d.f108899e.a("video_share", new com.ss.android.ugc.aweme.livewallpaper.f.b(this.f108749a.getAid()));
        } else if (this.f108750b instanceof com.bytedance.ies.foundation.activity.a) {
            ((com.bytedance.ies.foundation.activity.a) this.f108750b).activityConfiguration(new c(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.b.a
    public final void c() {
        this.f108753e = com.ss.android.ugc.aweme.livewallpaper.f.f.a();
        this.f108754f = com.bytedance.common.utility.d.b(this.f108749a.getVideo().getPlayAddrH264().getUri());
        this.f108756h = this.f108753e + this.f108754f + ".mp4";
        this.f108755g = this.f108753e + "temp/";
        if (!e.b(this.f108755g)) {
            e.a(this.f108755g, false);
        }
    }

    public b(Activity activity) {
        super(activity);
        this.f108750b = activity;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2) {
        if (i2 == 100 && com.ss.android.ugc.aweme.livewallpaper.f.f.a(this.f108750b, this.f108750b.getPackageName())) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.he_).a();
            com.ss.android.ugc.aweme.livewallpaper.f.f.a(this.f108749a.getAid(), "share");
            com.ss.android.ugc.aweme.livewallpaper.f.f.a(0, "");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.livewallpaper.b.a
    public final boolean b(Aweme aweme) {
        VideoUrlModel playAddrH264;
        String str;
        Video video = aweme.getVideo();
        if (video == null || (playAddrH264 = video.getPlayAddrH264()) == null) {
            return false;
        }
        List<String> urlList = playAddrH264.getUrlList();
        if (com.bytedance.common.utility.collection.b.a((Collection) urlList)) {
            return false;
        }
        if (urlList.size() > 2) {
            str = urlList.get(2);
        } else {
            str = urlList.get(0);
        }
        this.f108752d = com.ss.android.ugc.aweme.app.e.a.a(aweme, str);
        if (!TextUtils.isEmpty(this.f108752d)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.b.a
    public final void b(String str) {
        if (str != null) {
            this.f108755g = str;
            if (str.length() == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("LiveWallPaperHelper download file size == 0: " + this.f108752d));
                f();
                com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "file size == 0");
                return;
            }
            String trim = str.trim();
            this.f108756h = this.f108753e + trim.substring(trim.lastIndexOf("/") + 1);
            e.c(str, this.f108756h);
            a();
            a.b(new Runnable() {
                /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(69674);
                }

                public final void run() {
                    b.this.b();
                    b bVar = b.this;
                    bVar.c(bVar.f108756h);
                }
            });
            com.ss.android.ugc.aweme.livewallpaper.f.f.b(0, "");
        }
    }

    public final void c(final Aweme aweme) {
        UrlModel cover;
        if (aweme != null && !com.ss.android.ugc.aweme.livewallpaper.f.f.a(this.f108750b, aweme.getAid(), aweme)) {
            if (this.f108750b != null && !this.f108750b.isFinishing()) {
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = i();
                }
                if (!j.f107229h) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f108750b).a(this.f108750b.getString(R.string.fir)).a();
                    return;
                }
            }
            Video video = aweme.getVideo();
            if (video != null && (cover = video.getCover()) != null) {
                a(d());
                com.ss.android.ugc.aweme.base.e.a(cover, new e.a() {
                    /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(69675);
                    }

                    @Override // com.ss.android.ugc.aweme.base.e.a
                    public final void a() {
                        b bVar = b.this;
                        Aweme aweme = aweme;
                        if (aweme == null || aweme.getVideo() == null) {
                            bVar.g();
                            com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "aweme is empty");
                            return;
                        }
                        UrlModel cover = aweme.getVideo().getCover();
                        if (cover == null) {
                            bVar.g();
                            com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "cover is empty");
                            return;
                        }
                        i.b(new Callable<Boolean>(cover, aweme) {
                            /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass5 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ UrlModel f108768a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ Aweme f108769b;

                            static {
                                Covode.recordClassIndex(69677);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Boolean call() {
                                int lastIndexOf;
                                List<String> urlList = this.f108768a.getUrlList();
                                if (com.bytedance.common.utility.collection.b.a((Collection) urlList)) {
                                    b.this.g();
                                    com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "urlList is empty");
                                } else {
                                    for (String str : urlList) {
                                        if (str != null) {
                                            String a2 = com.ss.android.ugc.aweme.base.e.a(str);
                                            if (com.ss.android.ugc.aweme.video.e.b(a2) && (lastIndexOf = a2.lastIndexOf("/") + 1) >= 0 && lastIndexOf < a2.length()) {
                                                String substring = a2.substring(lastIndexOf);
                                                if (!TextUtils.isEmpty(substring)) {
                                                    String str2 = com.ss.android.ugc.aweme.livewallpaper.f.f.a() + substring;
                                                    if (com.ss.android.ugc.aweme.video.e.b(str2) || com.ss.android.ugc.aweme.video.e.c(a2, str2)) {
                                                        a.b(new Runnable(str2, this.f108769b) {
                                                            /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass7 */

                                                            /* renamed from: a  reason: collision with root package name */
                                                            final /* synthetic */ String f108772a;

                                                            /* renamed from: b  reason: collision with root package name */
                                                            final /* synthetic */ Aweme f108773b;

                                                            static {
                                                                Covode.recordClassIndex(69679);
                                                            }

                                                            public final void run() {
                                                                d.f108899e.f108902c.setThumbnailPath(this.f108772a);
                                                                b.this.a(this.f108773b);
                                                            }

                                                            {
                                                                this.f108772a = r2;
                                                                this.f108773b = r3;
                                                            }
                                                        });
                                                        return true;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                                return false;
                            }

                            {
                                this.f108768a = r2;
                                this.f108769b = r3;
                            }
                        }, i.f4824a).a((g) new g<Boolean, Object>() {
                            /* class com.ss.android.ugc.aweme.livewallpaper.b.b.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(69676);
                            }

                            @Override // b.g
                            public final Object then(i<Boolean> iVar) {
                                if (iVar != null && iVar.d().booleanValue()) {
                                    return null;
                                }
                                b.this.g();
                                com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "copy video thumbnail fail");
                                return null;
                            }
                        });
                    }

                    @Override // com.ss.android.ugc.aweme.base.e.a
                    public final void a(Exception exc) {
                        if (b.this.f108750b != null && !b.this.f108750b.isFinishing()) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(b.this.f108750b).a(R.string.bbv).a();
                            b.this.b();
                            com.ss.android.ugc.aweme.livewallpaper.f.f.b(1, "request image fail " + exc.getMessage());
                        }
                    }
                });
            }
        }
    }

    public final void c(String str) {
        int i2;
        int i3;
        if (this.f108750b != null && !this.f108750b.isFinishing() && com.ss.android.ugc.aweme.video.e.b(str) && this.f108749a != null) {
            Video video = this.f108749a.getVideo();
            boolean z = false;
            if (video != null) {
                i3 = video.getWidth();
                i2 = video.getHeight();
            } else {
                i2 = 0;
                i3 = 0;
            }
            d.f108899e.f108902c.setId(this.f108749a.getAid());
            d.f108899e.f108902c.setVideoPath(str);
            d.f108899e.f108902c.setWidth(i3);
            d.f108899e.f108902c.setHeight(i2);
            d.f108899e.f108902c.setSource("video_share");
            d.f108899e.f108902c.setVolume(0.0f);
            Music music = this.f108749a.getMusic();
            if ((music != null && music.isPgc()) || ah.f123352a.a(this.f108749a)) {
                z = true;
            }
            d.f108899e.f108902c.setShouldMute(z);
            h();
            d.f108899e.a();
            a(this.f108750b, d.f108899e.f108902c);
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static void a(Context context, LiveWallPaperBean liveWallPaperBean) {
        Intent intent = new Intent(context, LiveWallPaperPreviewActivity.class);
        intent.putExtra("live_wall_paper", liveWallPaperBean);
        intent.putExtra("hide_more_button", true);
        intent.putExtra("from", "share");
        a(context, intent);
    }
}
