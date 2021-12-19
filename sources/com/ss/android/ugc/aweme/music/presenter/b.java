package com.ss.android.ugc.aweme.music.presenter;

import android.content.Context;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.c.a;
import com.zhiliaoapp.musically.R;

public abstract class b extends c<com.ss.android.ugc.aweme.common.b<BaseResponse>, d> {

    /* renamed from: a  reason: collision with root package name */
    protected int f111570a;

    /* renamed from: b  reason: collision with root package name */
    protected int f111571b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f111572c;

    static {
        Covode.recordClassIndex(71698);
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        d();
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f111570a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    public b(Context context) {
        this.f111572c = context;
        a(new com.ss.android.ugc.aweme.common.b<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.music.presenter.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71699);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                i<BaseResponse> collectMusic;
                b.this.f111571b = ((Integer) objArr[0]).intValue();
                final String str = (String) objArr[1];
                b.this.f111570a = ((Integer) objArr[2]).intValue();
                if (b.this.f111571b != 1 || (collectMusic = ChooseMusicApi.f70375a.collectMusic(str, b.this.f111570a)) == null) {
                    return false;
                }
                collectMusic.a(new g<BaseResponse, Void>() {
                    /* class com.ss.android.ugc.aweme.music.presenter.b.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(71700);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                    @Override // b.g
                    public final /* synthetic */ Void then(i<BaseResponse> iVar) {
                        if (iVar.c() || iVar.b()) {
                            b.this.a_(iVar.e());
                            return null;
                        }
                        a h2 = MusicService.m().h();
                        if (h2 != null) {
                            String str = str;
                            boolean z = true;
                            if (b.this.f111570a != 1) {
                                z = false;
                            }
                            h2.a(str, z);
                        }
                        b.this.c();
                        return null;
                    }
                }, i.f4826c, null);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        int i2;
        if (this.f111572c != null) {
            if (this.f111570a == 1) {
                i2 = R.string.ahj;
            } else {
                i2 = R.string.a9i;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f111572c).a(i2).a();
        }
        if (this.f76397i != null) {
            ((d) this.f76397i).a(exc);
        }
    }
}
