package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.account.c.a;
import com.ss.android.ugc.aweme.app.c.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.experiment.cj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.Map;
import java.util.concurrent.Callable;

public final class o extends a<b<FollowStatus>, r> implements w {

    /* renamed from: a  reason: collision with root package name */
    public int f116604a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f116605b;

    /* renamed from: c  reason: collision with root package name */
    public int f116606c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f116607d;

    static {
        Covode.recordClassIndex(75324);
    }

    public o() {
        a(new b<FollowStatus>() {
            /* class com.ss.android.ugc.aweme.profile.presenter.o.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75325);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 12) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                o.this.f116607d = (String) objArr[0];
                n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.aweme.profile.presenter.o.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(75326);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        FollowStatus followStatus;
                        Object[] objArr = objArr;
                        Aweme aweme = (Aweme) objArr[5];
                        String str = (String) objArr[6];
                        o.this.f116604a = ((Integer) objArr[1]).intValue();
                        o.this.f116605b = ((Boolean) objArr[11]).booleanValue();
                        o.this.f116606c = ((Integer) objArr[9]).intValue();
                        try {
                            Object[] objArr2 = objArr;
                            String str2 = (String) objArr2[3];
                            if (objArr2.length >= 11) {
                                IUserService d2 = UserService.d();
                                Object[] objArr3 = objArr;
                                int intValue = ((Integer) objArr3[1]).intValue();
                                int intValue2 = ((Integer) objArr[2]).intValue();
                                int a2 = c.a(str2);
                                Object[] objArr4 = objArr;
                                followStatus = d2.a((String) objArr3[0], (String) objArr3[8], intValue, intValue2, a2, (String) objArr4[4], ((Integer) objArr4[7]).intValue(), "", (Map) objArr[10]);
                                if (followStatus != null) {
                                    followStatus.followerStatus = ((Integer) objArr[9]).intValue();
                                    followStatus.followFrom = ((Integer) objArr[2]).intValue();
                                }
                            } else {
                                IUserService d3 = UserService.d();
                                Object[] objArr5 = objArr;
                                int intValue3 = ((Integer) objArr5[1]).intValue();
                                int intValue4 = ((Integer) objArr[2]).intValue();
                                int a3 = c.a(str2);
                                Object[] objArr6 = objArr;
                                followStatus = d3.a((String) objArr5[0], "", intValue3, intValue4, a3, (String) objArr6[4], ((Integer) objArr6[7]).intValue(), "", (Map) objArr[9]);
                            }
                            AnonymousClass1.a(((Integer) objArr[1]).intValue(), aweme, str, followStatus);
                            return followStatus;
                        } catch (com.ss.android.ugc.aweme.base.api.a.b.a e2) {
                            if (e2.getErrorCode() == 2149 && com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                                AnonymousClass1.a(((Integer) objArr[1]).intValue(), aweme, str, new FollowStatus((String) objArr[0], 0, e2.getErrorCode()));
                            }
                            throw e2;
                        }
                    }
                }, 0);
                return true;
            }

            public static void a(int i2, Aweme aweme, String str, FollowStatus followStatus) {
                if (str != null) {
                    int i3 = 1;
                    if (i2 == 1 && com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                        str.hashCode();
                        int i4 = 0;
                        if (str.equals("homepage")) {
                            g.a().b(d.a(), aweme, followStatus);
                            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "follow", aweme.getAwemeRawAd());
                            if (followStatus != null && followStatus.isCheating()) {
                                i4 = 1;
                            }
                            a.C0791a a3 = a2.a("is_cheated_follow", Integer.valueOf(i4));
                            if (followStatus != null) {
                                i3 = followStatus.followStatus;
                            }
                            a3.a("follow_status", Integer.valueOf(i3)).c();
                        } else if (str.equals("feed")) {
                            g.a().a(d.a(), aweme, followStatus);
                            a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "follow", aweme.getAwemeRawAd());
                            if (followStatus != null && followStatus.isCheating()) {
                                i4 = 1;
                            }
                            a.C0791a a5 = a4.a("is_cheated_follow", Integer.valueOf(i4));
                            if (followStatus != null) {
                                i3 = followStatus.followStatus;
                            }
                            a5.a("follow_status", Integer.valueOf(i3)).c();
                        }
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.account.c.a
    public final void c() {
        T t;
        T t2 = null;
        if (this.f76396h == null) {
            t = null;
        } else {
            t = this.f76396h.mData;
        }
        r rVar = (r) this.f76397i;
        if (this.f76396h != null) {
            t2 = this.f76396h.mData;
        }
        rVar.c(t2);
        if (t != null) {
            if (t.followStatus == 1) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_follow", t.userId);
            }
            User user = new User();
            user.setUid(t.userId);
            user.setSecUid(t.secUserId);
            user.setFollowStatus(t.followStatus);
            user.setFollowerStatus(t.followerStatus);
            IMAdapterServiceImpl.d().a(user);
        }
        if (!cj.a()) {
            a((FollowStatus) t);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.ui.w
    public final /* synthetic */ void a(r rVar) {
        super.a_(rVar);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.account.c.a
    public final boolean a(Object... objArr) {
        return super.a(objArr);
    }

    private void a(FollowStatus followStatus) {
        if (followStatus != null && this.f76397i != null) {
            ((r) this.f76397i).b(followStatus);
            new FollowStatusEvent(followStatus).post();
            UserService.d().b().postValue(followStatus);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            int i2 = 1;
            if (com.ss.android.ugc.aweme.app.api.b.a.a(exc) != null) {
                int i3 = this.f116604a;
                if (i3 == 1) {
                    RuntimeBehaviorServiceImpl.c().a("follow_user", String.valueOf(com.ss.android.ugc.aweme.app.api.b.a.a(exc).getErrorCode()));
                } else if (i3 == 0) {
                    RuntimeBehaviorServiceImpl.c().a("unfollow_user", String.valueOf(com.ss.android.ugc.aweme.app.api.b.a.a(exc).getErrorCode()));
                }
            }
            ((r) this.f76397i).d_(exc);
            String str = this.f116607d;
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = str;
            if (this.f116604a != 0) {
                i2 = 0;
            } else if (this.f116605b) {
                i2 = 4;
            } else if (this.f116606c == 1) {
                i2 = 2;
            }
            followStatus.followStatus = i2;
            followStatus.followerStatus = this.f116606c;
            followStatus.isFollowSucess = false;
            new FollowStatusEvent(followStatus).post();
            UserService.d().b().postValue(followStatus);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r8 != null) goto L_0x002b;
     */
    @Override // com.ss.android.ugc.aweme.friends.ui.w
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.profile.presenter.n r8) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.o.a(com.ss.android.ugc.aweme.profile.presenter.n):boolean");
    }
}
