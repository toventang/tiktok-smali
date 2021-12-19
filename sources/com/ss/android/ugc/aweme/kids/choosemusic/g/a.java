package com.ss.android.ugc.aweme.kids.choosemusic.g;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.b.a.b;
import com.ss.android.ugc.aweme.kids.b.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.e.s;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.a f105642a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC2696a f105643b;
    private Handler s;
    private HandlerThread t;
    private s u;

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.g.a$a  reason: collision with other inner class name */
    public interface AbstractC2696a {
        static {
            Covode.recordClassIndex(67671);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(67666);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.d
    public final void a() {
        super.a();
        if (this.f105362l != null && this.f105642a != null) {
            c.a(this.f105362l.getMusicId());
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.d
    public final void c() {
        this.f105356f.a(new b(this));
        this.f105356f.a(new com.ss.android.ugc.aweme.kids.b.a.a() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.g.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(67668);
            }

            @Override // com.ss.android.ugc.aweme.kids.b.a.a
            public final void a() {
                if (a.this.f105643b != null) {
                    a.this.f105643b.a();
                }
                if (a.this.f105642a.f105439h) {
                    c.a(a.this.f105362l.getMusicId());
                }
            }
        });
        this.f105356f.a(new b() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.g.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(67669);
            }

            @Override // com.ss.android.ugc.aweme.kids.b.a.b
            public final void a() {
                if (a.this.f105643b != null) {
                    a.this.f105643b.b();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.d
    public final void b() {
        if (this.n != null) {
            this.n.cancel();
        }
        if (this.s != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            this.s.sendMessage(obtain);
        } else if (this.f105356f != null) {
            this.f105356f.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.d
    public final void d() {
        super.d();
        HandlerThread handlerThread = this.t;
        if (handlerThread != null) {
            handlerThread.quit();
            this.t = null;
        }
        Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.s = null;
        }
        if (this.f105356f != null) {
            this.f105356f.a((com.ss.android.ugc.aweme.kids.b.a.a) null);
            this.f105356f.a((b) null);
            this.f105356f.a((c) null);
            this.f105356f.a();
        }
        this.f105643b = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2) {
        if (this.f105362l != null) {
            MusicModel musicModel = this.f105362l;
            if (this.n != null) {
                this.n.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                this.n = new CountDownTimer((long) musicModel.getRealAuditionDuration()) {
                    /* class com.ss.android.ugc.aweme.kids.choosemusic.g.a.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(67670);
                    }

                    public final void onTick(long j2) {
                    }

                    public final void onFinish() {
                        a.this.f105356f.b();
                        if (a.this.f105643b != null) {
                            a.this.f105643b.a();
                        }
                    }
                };
                this.n.start();
            }
        }
        com.ss.android.ugc.aweme.kids.choosemusic.a aVar = this.f105642a;
        MusicModel musicModel2 = this.f105362l;
        if (!(aVar == null || musicModel2 == null || musicModel2.getMusicType() == MusicModel.MusicType.LOCAL || c.f105650b == -1)) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("enter_from", aVar.f105432a).a("music_id", musicModel2.getMusicId()).a("category_name", aVar.f105433b).a("enter_method", aVar.f105434c).a("previous_page", aVar.f105435d).a("order", c.f105650b);
            r.a("play_music", dVar.f66730a);
        }
        String musicId = this.f105362l.getMusicId();
        if (c.f105653e == null) {
            c.f105653e = new e();
        }
        e eVar = c.f105653e;
        eVar.f105654a = musicId;
        eVar.f105656c = 0;
        eVar.f105655b = System.currentTimeMillis();
        eVar.f105657d = i2;
        String musicId2 = this.f105362l.getMusicId();
        s sVar = this.u;
        if (sVar != null && TextUtils.equals(musicId2, sVar.f105635a)) {
            com.bytedance.apm.b.a("time_from_click_music_to_start_play", new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(System.currentTimeMillis() - this.u.f105636b)).a());
        }
        if (this.f105361k && this.f105356f != null) {
            b();
        }
        if (this.f105353c != null && this.f105353c.h() != null && i2 != 0) {
            this.f105353c.h().setDuration(i2);
        }
    }

    public a(com.ss.android.ugc.aweme.kids.a.h.c cVar, AbstractC2696a aVar) {
        super(cVar);
        this.f105643b = aVar;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.d
    public final void a(MusicModel musicModel, int i2, boolean z) {
        f fVar = new f(musicModel, i2, z);
        if (musicModel != null) {
            this.u = new s(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.t == null) {
            HandlerThread handlerThread = new HandlerThread("play_music");
            this.t = handlerThread;
            handlerThread.start();
        }
        if (this.s == null) {
            this.s = new Handler(this.t.getLooper()) {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.g.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67667);
                }

                public final void handleMessage(Message message) {
                    if (message.what == 2) {
                        if (a.this.f105356f != null) {
                            a.this.f105356f.b();
                        }
                    } else if (message.what == 1) {
                        f fVar = (f) message.obj;
                        a.super.a((a) fVar.f105658a, (MusicModel) fVar.f105659b, (int) fVar.f105660c);
                    }
                }
            };
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = fVar;
        this.s.sendMessage(obtain);
    }
}
