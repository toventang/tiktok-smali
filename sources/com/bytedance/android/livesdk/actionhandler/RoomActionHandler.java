package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.j;
import com.bytedance.android.livesdk.event.f;
import com.bytedance.android.livesdk.livesetting.roomfunction.ReturnBackSettingsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptSchemaWatchLiveSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import f.a.t;
import f.a.v;
import java.util.Map;
import org.json.JSONObject;

public class RoomActionHandler implements e {
    private boolean isFromPush;
    private volatile q roomActionHandler2;

    static {
        Covode.recordClassIndex(7547);
    }

    private q getRoomActionHandler2() {
        MethodCollector.i(1907);
        if (this.roomActionHandler2 == null) {
            synchronized (this) {
                try {
                    if (this.roomActionHandler2 == null) {
                        this.roomActionHandler2 = new q();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1907);
                    throw th;
                }
            }
        }
        q qVar = this.roomActionHandler2;
        MethodCollector.o(1907);
        return qVar;
    }

    public String getExtraAutoRouteSchema(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).getString("auto_route_schema");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public boolean canHandle(Uri uri) {
        if (TextUtils.equals("live", uri.getHost())) {
            return true;
        }
        if (!TextUtils.equals("webcast_room", uri.getHost())) {
            return false;
        }
        if (TextUtils.equals("/", uri.getPath()) || TextUtils.equals("", uri.getPath())) {
            return true;
        }
        return false;
    }

    private EnterRoomConfig fillInEnterRoomConfig(Room room, EnterRoomConfig enterRoomConfig) {
        enterRoomConfig.f23299c.Y = room.getId();
        return enterRoomConfig;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handle$0$RoomActionHandler(long j2, v vVar) {
        String str;
        try {
            T t = ((ActionHandlerApi) e.a().a(ActionHandlerApi.class)).getRoomStats(false, j2, 2).execute().f42630b;
            if (t != null) {
                Room room = (Room) ((d) t).data;
                if (room != null) {
                    User owner = room.getOwner();
                    if (room.getStatus() == 4) {
                        str = "live_finish";
                    } else {
                        str = "live_on";
                    }
                    logPushCheckLiveState(owner, j2, str);
                }
            }
        } catch (Exception e2) {
            a.a("ttlive_push", e2);
        }
    }

    public void logPushClick(String str, String str2) {
        if (this.isFromPush) {
            b.a.a("livesdk_push_click").a(new j.a().a("anchor_id", str2).a("room_id", str).f13591a).b();
        }
    }

    public EnterRoomConfig addSlimRoomData(String str, EnterRoomConfig enterRoomConfig) {
        SlimRoom slimRoom = (SlimRoom) com.bytedance.android.livesdk.util.a.a(h.a(str), SlimRoom.class);
        if (slimRoom != null) {
            enterRoomConfig.f23297a.f23349m = true;
            enterRoomConfig.f23297a.f23348l = slimRoom.getId();
            enterRoomConfig.f23297a.f23338b = slimRoom.buildPullUrl();
            enterRoomConfig.f23297a.f23339c = slimRoom.getSdkParams();
            enterRoomConfig.f23297a.f23340d = slimRoom.getMultiStreamData();
            enterRoomConfig.f23297a.f23342f = slimRoom.getMultiStreamDefaultQualitySdkKey();
            s.a aVar = slimRoom.getStreamUrlExtraSafely().n;
            if (aVar != null) {
                enterRoomConfig.f23297a.f23343g = aVar.f23192a;
                enterRoomConfig.f23297a.f23344h = aVar.f23193b;
                enterRoomConfig.f23297a.f23345i = aVar.f23194c;
            }
            enterRoomConfig.f23297a.f23346j = slimRoom.getStreamType().ordinal();
        }
        return enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public boolean handle(final Context context, final Uri uri) {
        if (LiveOptSchemaWatchLiveSetting.INSTANCE.getValue()) {
            return getRoomActionHandler2().handle(context, uri);
        }
        String queryParameter = uri.getQueryParameter("room_id");
        long j2 = 0;
        if (!TextUtils.isEmpty(queryParameter)) {
            long parseLong = Long.parseLong(queryParameter);
            if (parseLong <= 0) {
                return false;
            }
            String str = "";
            String queryParameter2 = uri.getQueryParameter("enter_from_merge");
            String queryParameter3 = uri.getQueryParameter("enter_method");
            String queryParameter4 = uri.getQueryParameter("inner_push_type");
            String queryParameter5 = uri.getQueryParameter("gd_label");
            String queryParameter6 = uri.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter6)) {
                try {
                    j2 = Long.parseLong(queryParameter6);
                } catch (NumberFormatException e2) {
                    e2.printStackTrace();
                }
            }
            if (m.a(str)) {
                str = String.valueOf(j2);
            }
            logPushClick(queryParameter, queryParameter6);
            if (this.isFromPush) {
                t.a(new l(this, parseLong)).b(f.a.h.a.b(f.a.k.a.f158006c)).g();
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f23299c.R = parseLong;
            enterRoomConfig.f23298b.f23310b = str;
            enterRoomConfig.f23299c.X = uri.getQueryParameter("enter_live_source");
            enterRoomConfig.f23299c.J = queryParameter2;
            enterRoomConfig.f23299c.L = uri.getQueryParameter("enter_method");
            enterRoomConfig.f23298b.f23321m = uri.getQueryParameter("enter_from_module");
            enterRoomConfig.f23299c.D = queryParameter6;
            enterRoomConfig.f23299c.f23332k = uri.getQueryParameter("tip");
            enterRoomConfig.f23299c.L = queryParameter3;
            enterRoomConfig.f23298b.q = queryParameter4;
            enterRoomConfig.f23298b.r = queryParameter5;
            enterRoomConfig.f23298b.f23309a = uri.getQueryParameter("request_id");
            enterRoomConfig.f23298b.f23315g = uri.getQueryParameter("log_pb");
            enterRoomConfig.f23299c.f23331j = uri.getQueryParameter("tip_i18n");
            enterRoomConfig.f23298b.p = uri.getQueryParameter("top_message_type");
            enterRoomConfig.f23299c.r = -1;
            enterRoomConfig.f23298b.t = uri.getQueryParameter("pop_type");
            enterRoomConfig.f23298b.f23311c = uri.getQueryParameter("video_id");
            enterRoomConfig.f23299c.f23330i = uri.getQueryParameter("back_room");
            enterRoomConfig.f23298b.f23317i = uri.getQueryParameter("request_page");
            enterRoomConfig.f23298b.f23318j = uri.getQueryParameter("anchor_type");
            enterRoomConfig.f23298b.H = uri.getQueryParameter("magic3_source");
            enterRoomConfig.f23298b.I = uri.getQueryParameter("magic3_activityId");
            enterRoomConfig.f23298b.J = uri.getQueryParameter("magic3_comptype");
            enterRoomConfig.f23298b.x = uri.getQueryParameter("search_id");
            enterRoomConfig.f23298b.z = uri.getQueryParameter("search_result_id");
            enterRoomConfig.f23299c.aF = getExtraAutoRouteSchema(uri.getQueryParameter("extra_params"));
            String queryParameter7 = uri.getQueryParameter("slim_room");
            com.bytedance.android.livesdk.utils.a.a(uri, enterRoomConfig);
            if (!TextUtils.isEmpty(queryParameter7)) {
                enterRoomConfig = addSlimRoomData(queryParameter7, enterRoomConfig);
            }
            return handleEnterRoom(context, enterRoomConfig);
        }
        final String queryParameter8 = uri.getQueryParameter("user_id");
        if (TextUtils.isEmpty(queryParameter8)) {
            return false;
        }
        long parseLong2 = Long.parseLong(queryParameter8);
        if (parseLong2 <= 0) {
            return false;
        }
        u.a().b().b(parseLong2).a_(new ae<User>() {
            /* class com.bytedance.android.livesdk.actionhandler.RoomActionHandler.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7548);
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                RoomActionHandler.this.logPushClick("-1", queryParameter8);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(User user) {
                String str;
                User user2 = user;
                RoomActionHandler.this.logPushClick(String.valueOf(user2.getLiveRoomId()), queryParameter8);
                long liveRoomId = user2.getLiveRoomId();
                RoomActionHandler roomActionHandler = RoomActionHandler.this;
                if (liveRoomId > 0) {
                    str = "live_on";
                } else {
                    str = "live_finish";
                }
                roomActionHandler.logPushCheckLiveState(user2, liveRoomId, str);
                if (liveRoomId > 0) {
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.f23299c.R = liveRoomId;
                    enterRoomConfig.f23298b.f23310b = queryParameter8;
                    enterRoomConfig.f23298b.f23319k = liveRoomId;
                    enterRoomConfig.f23299c.X = uri.getQueryParameter("enter_live_source");
                    enterRoomConfig.f23299c.J = uri.getQueryParameter("enter_from_merge");
                    enterRoomConfig.f23298b.f23321m = uri.getQueryParameter("enter_from_module");
                    enterRoomConfig.f23299c.D = queryParameter8;
                    enterRoomConfig.f23299c.f23332k = uri.getQueryParameter("tip");
                    enterRoomConfig.f23299c.L = uri.getQueryParameter("enter_method");
                    enterRoomConfig.f23298b.q = uri.getQueryParameter("inner_push_type");
                    enterRoomConfig.f23298b.r = uri.getQueryParameter("gd_label");
                    enterRoomConfig.f23298b.f23309a = uri.getQueryParameter("request_id");
                    enterRoomConfig.f23298b.f23315g = uri.getQueryParameter("log_pb");
                    enterRoomConfig.f23299c.f23331j = uri.getQueryParameter("tip_i18n");
                    enterRoomConfig.f23298b.p = uri.getQueryParameter("top_message_type");
                    enterRoomConfig.f23298b.t = uri.getQueryParameter("pop_type");
                    enterRoomConfig.f23298b.f23311c = uri.getQueryParameter("video_id");
                    enterRoomConfig.f23299c.f23330i = uri.getQueryParameter("back_room");
                    enterRoomConfig.f23298b.f23317i = uri.getQueryParameter("request_page");
                    enterRoomConfig.f23298b.f23318j = uri.getQueryParameter("anchor_type");
                    enterRoomConfig.f23298b.H = uri.getQueryParameter("magic3_source");
                    enterRoomConfig.f23298b.I = uri.getQueryParameter("magic3_activityId");
                    enterRoomConfig.f23298b.J = uri.getQueryParameter("magic3_comptype");
                    enterRoomConfig.f23298b.x = uri.getQueryParameter("search_id");
                    enterRoomConfig.f23298b.z = uri.getQueryParameter("search_result_id");
                    enterRoomConfig.f23299c.aF = RoomActionHandler.this.getExtraAutoRouteSchema(uri.getQueryParameter("extra_params"));
                    String queryParameter = uri.getQueryParameter("slim_room");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        enterRoomConfig = RoomActionHandler.this.addSlimRoomData(queryParameter, enterRoomConfig);
                    }
                    RoomActionHandler.this.handleEnterRoom(context, enterRoomConfig);
                    return;
                }
                ao.a(context, y.e().getString(R.string.gsh), 0);
            }
        });
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0153, code lost:
        if (r1 != com.bytedance.android.livesdk.chatroom.f.c.f15496a) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleEnterRoom(android.content.Context r12, com.bytedance.android.livesdkapi.session.EnterRoomConfig r13) {
        /*
        // Method dump skipped, instructions count: 421
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.actionhandler.RoomActionHandler.handleEnterRoom(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    @Override // com.bytedance.android.livesdk.actionhandler.f
    public boolean handle(Context context, Uri uri, Map<String, String> map) {
        if (LiveOptSchemaWatchLiveSetting.INSTANCE.getValue()) {
            return getRoomActionHandler2().handle(context, uri, map);
        }
        return handle(context, uri);
    }

    public void logPushCheckLiveState(User user, long j2, String str) {
        if (this.isFromPush) {
            b a2 = b.a.a("livesdk_push_click_lookup_anchor");
            j.a a3 = new j.a().a("anchor_id", String.valueOf(user.getId())).a("anchor_status", str);
            if (j2 <= 0) {
                j2 = 0;
            }
            a2.a(a3.a("room_id", String.valueOf(j2)).f13591a).b();
        }
    }

    private void jumpToOtherRoom(EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
        String str;
        EnterRoomConfig fillInEnterRoomConfig = fillInEnterRoomConfig(room, enterRoomConfig);
        enterRoomLinkSession.a(new Event("live_scheme_jump_to_other_room", 771, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        com.bytedance.android.livesdk.event.e eVar = new com.bytedance.android.livesdk.event.e(fillInEnterRoomConfig.f23299c.R);
        eVar.f17190d = fillInEnterRoomConfig;
        if ("true".equals(fillInEnterRoomConfig.f23299c.f23330i)) {
            com.bytedance.android.livesdk.an.a.a().a(new f(eVar));
            return;
        }
        if (ReturnBackSettingsSetting.INSTANCE.getValue().a()) {
            if (!((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoom() || !fillInEnterRoomConfig.f23299c.ag) {
                str = "jump_source_live_banner";
            } else {
                str = "jump_source_mic_room";
            }
            fillInEnterRoomConfig.f23299c.av = str;
        }
        com.bytedance.android.livesdk.an.a.a().a(eVar);
    }

    private void jumpToOtherRoom(EnterRoomLinkSession enterRoomLinkSession, Room room, long j2, EnterRoomConfig enterRoomConfig) {
        String str;
        EnterRoomConfig fillInEnterRoomConfig = fillInEnterRoomConfig(room, enterRoomConfig);
        com.bytedance.android.livesdk.event.e eVar = new com.bytedance.android.livesdk.event.e(j2);
        enterRoomLinkSession.a(new Event("live_scheme_jump_to_other_room", 772, com.bytedance.android.livesdkapi.session.b.BussinessApiCall));
        eVar.f17190d = fillInEnterRoomConfig;
        if ("true".equals(fillInEnterRoomConfig.f23299c.f23330i)) {
            com.bytedance.android.livesdk.an.a.a().a(new f(eVar));
            return;
        }
        if (ReturnBackSettingsSetting.INSTANCE.getValue().a()) {
            if (!((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoom() || !fillInEnterRoomConfig.f23299c.ag) {
                str = "jump_source_live_banner";
            } else {
                str = "jump_source_mic_room";
            }
            fillInEnterRoomConfig.f23299c.av = str;
        }
        com.bytedance.android.livesdk.an.a.a().a(eVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handleEnterRoom$3$RoomActionHandler(EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig, DialogInterface dialogInterface, int i2) {
        jumpToOtherRoom(enterRoomLinkSession, room, enterRoomConfig.f23299c.R, enterRoomConfig);
        dialogInterface.dismiss();
    }
}
