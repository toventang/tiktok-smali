package com.ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public class ae implements WeakHandler.IHandler, w {

    /* renamed from: a  reason: collision with root package name */
    public boolean f116518a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f116519b;

    /* renamed from: c  reason: collision with root package name */
    public x f116520c;

    /* renamed from: d  reason: collision with root package name */
    public int f116521d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f116522e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f116523f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f116524g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f116525h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f116526i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f116527j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f116528k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f116529l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f116530m;
    private boolean n;
    private boolean o;
    private boolean p;

    static {
        Covode.recordClassIndex(75303);
    }

    public ae() {
        this((byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.w
    public final void a() {
        if (!this.n) {
            this.n = true;
            b.g().updateSecret(this.f116519b, true, this.f116521d, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.w
    public final void a(x xVar) {
        this.f116520c = xVar;
    }

    public final void b(String str) {
        if (!this.f116524g) {
            this.f116524g = true;
            b.g().updateNickName(this.f116519b, str, this.f116521d);
        }
    }

    public final void c(String str) {
        if (!this.f116525h) {
            this.f116525h = true;
            b.g().updateSignature(this.f116519b, str, this.f116521d);
        }
    }

    public final void d(String str) {
        if (!this.f116527j) {
            this.f116527j = true;
            b.g().updateAvatarUri(this.f116519b, str, this.f116521d);
        }
    }

    private ae(byte b2) {
        this.f116521d = 0;
        this.f116522e = false;
        this.f116523f = false;
        this.f116524g = false;
        this.f116525h = false;
        this.f116518a = false;
        this.f116526i = false;
        this.f116527j = false;
        this.f116528k = false;
        this.f116529l = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.f116519b = new WeakHandler(this);
    }

    public final void a(String str) {
        if (!this.f116530m) {
            this.f116530m = true;
            b.g().updateId(this.f116519b, str, this.f116521d);
        }
    }

    public final void a(Map<String, String> map) {
        if (map != null && map.size() != 0 && !this.f116522e) {
            this.f116522e = true;
            map.put("page_from", String.valueOf(this.f116521d));
            b.g().updateUserInfo(this.f116519b, map);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            a((Exception) message.obj, message.what);
        } else if (message.obj instanceof User) {
            a((User) message.obj, message.what);
        } else if (message.obj instanceof UserResponse) {
            UserResponse userResponse = (UserResponse) message.obj;
            if (userResponse.getAction() == 1) {
                a(userResponse.status_msg, true);
                a((Exception) null, message.what);
            } else if (userResponse.getAction() == 2) {
                a(userResponse.status_msg, false);
                a((Exception) null, message.what);
            } else {
                a(userResponse.getUser(), message.what);
            }
        }
    }

    private void a(String str, boolean z) {
        this.f116522e = false;
        this.f116524g = false;
        x xVar = this.f116520c;
        if (xVar != null) {
            xVar.a(str, z);
        }
    }

    private void a(Exception exc, int i2) {
        if (i2 == 0) {
            this.f116524g = false;
        } else if (i2 == 112) {
            this.f116522e = false;
        } else if (i2 == 116) {
            this.f116530m = false;
        } else if (i2 == 122) {
            this.n = false;
        } else if (i2 == 2) {
            this.f116525h = false;
        } else if (i2 == 3) {
            this.f116523f = false;
        } else if (i2 == 4) {
            this.f116527j = false;
        } else if (i2 != 5) {
            switch (i2) {
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    this.o = false;
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    this.p = false;
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f116528k = false;
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    this.f116518a = false;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    this.f116526i = false;
                    break;
            }
        } else {
            this.f116529l = false;
        }
        x xVar = this.f116520c;
        if (xVar != null && exc != null) {
            xVar.a(exc, i2);
            if (!this.f116527j && !this.f116523f && !this.f116524g && !this.f116525h && !this.f116518a && !this.f116526i && !this.f116530m && !this.f116522e && !this.n && !this.f116528k) {
                this.f116520c.a(false);
            }
        }
    }

    private void a(User user, int i2) {
        if (user != null) {
            if (i2 == 0) {
                this.f116524g = false;
                b.g().updateCurNickname(user.getNickname());
            } else if (i2 == 2) {
                this.f116525h = false;
                b.g().updateCurSignature(user.getSignature());
            } else if (i2 == 112) {
                UrlModel avatarVideoUri = user.getAvatarVideoUri();
                if (!(avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0)) {
                    b.g().getCurUser().setAvatarUpdateReminder(false);
                }
                this.f116522e = false;
                b.g().updateCurUser(user);
            } else if (i2 == 116) {
                af.a();
                this.f116530m = false;
                b.g().updateCurUserId(user.getUniqueId());
            } else if (i2 == 122) {
                this.n = false;
                b.g().updateCurSecret(user.isSecret());
            } else if (i2 == 4) {
                b.g().getCurUser().setAvatarUpdateReminder(false);
                this.f116527j = false;
                b.g().updateCurAvatar(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
            } else if (i2 != 5) {
                switch (i2) {
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        this.o = false;
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        this.p = false;
                        break;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        this.f116528k = false;
                        b.g().updateCurCover(user.getCoverUrls());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        this.f116528k = false;
                        b.g().updateCurVideoCover(user.getVideoCover());
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        this.f116518a = false;
                        b.g().updateCurSupportedNgo(user.getProfileNgoStruct());
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        this.f116526i = false;
                        b.g().updateCurSupportedNgo(user.getProfileNgoStruct());
                        break;
                }
            } else {
                this.f116529l = false;
                b.g().updateCurAllowStatus(user.getAllowStatus());
            }
            x xVar = this.f116520c;
            if (xVar != null) {
                xVar.a(user, i2);
                if (!this.f116527j && !this.f116523f && !this.f116524g && !this.f116525h && !this.f116518a && !this.f116530m && !this.f116522e && !this.n && !this.f116528k) {
                    this.f116520c.a(true);
                }
            }
        }
    }
}
