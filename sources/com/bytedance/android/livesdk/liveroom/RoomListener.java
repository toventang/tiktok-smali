package com.bytedance.android.livesdk.liveroom;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.fragment.app.e;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.ac;
import com.bytedance.android.live.core.f.d;
import com.bytedance.android.livesdk.ab;
import com.bytedance.android.livesdk.chatroom.detail.r;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.d.l;
import com.bytedance.android.livesdkapi.depend.d.m;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.b;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class RoomListener implements ISubController {
    ab fragment;
    l mRoomAction;
    m mRoomEventListener;

    static {
        Covode.recordClassIndex(10481);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    public l getRoomAction() {
        return this.mRoomAction;
    }

    public m getRoomEventListener() {
        return this.mRoomEventListener;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
        initRoomEnvironment();
    }

    private String getLiveEnterMerge() {
        return f.a.f23366a.a().f23354b.f23299c.J;
    }

    private String getLiveEnterMethod() {
        return f.a.f23366a.a().f23354b.f23299c.L;
    }

    public boolean initRoomEnvironment() {
        if (this.mRoomAction == null) {
            this.mRoomAction = new l() {
                /* class com.bytedance.android.livesdk.liveroom.RoomListener.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(10482);
                }

                @Override // com.bytedance.android.livesdkapi.depend.d.l
                public final void a() {
                    e activity;
                    r.a.a().a();
                    if (RoomListener.this.fragment != null && (activity = RoomListener.this.fragment.getActivity()) != null) {
                        activity.finish();
                    }
                }
            };
        }
        if (this.mRoomEventListener == null) {
            this.mRoomEventListener = new m() {
                /* class com.bytedance.android.livesdk.liveroom.RoomListener.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(10483);
                }

                @Override // com.bytedance.android.livesdkapi.depend.d.m
                public final void a() {
                    if (RoomListener.this.fragment != null) {
                        e activity = RoomListener.this.fragment.getActivity();
                        if (Build.VERSION.SDK_INT >= 21) {
                            ac.a((Activity) activity);
                        }
                    }
                }

                @Override // com.bytedance.android.livesdkapi.depend.d.m
                public final void a(boolean z) {
                    e activity;
                    Window window;
                    if (RoomListener.this.fragment != null && (activity = RoomListener.this.fragment.getActivity()) != null && (window = activity.getWindow()) != null) {
                        if (!z) {
                            activity.getWindow().setFlags(1024, 1024);
                        } else if (d.a(activity)) {
                            window.clearFlags(1024);
                        }
                    }
                }
            };
        }
        if (this.mRoomAction == null || !u.a().b().d()) {
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", getLiveEnterMerge());
        hashMap.put("enter_method", getLiveEnterMethod());
        hashMap.put("source", "live room fg");
        c.a("ttlive_minor_mode_live", 1, hashMap);
        Event event = new Event("room_fg_enter_room_fail", 33028, b.BussinessApiCall);
        event.a("ftc or delete by age gate.");
        f.a.f23366a.a().a(event);
        this.mRoomAction.a();
        return false;
    }

    public RoomListener(ab abVar) {
        this.fragment = abVar;
    }
}
