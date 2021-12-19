package com.bytedance.android.live.broadcast.api.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.d;
import com.bytedance.android.live.broadcast.api.e.a;
import com.bytedance.android.live.broadcast.api.e.c;
import com.bytedance.android.live.n.j;
import com.bytedance.android.livesdkapi.depend.model.a.b;
import com.bytedance.android.livesdkapi.depend.model.a.f;
import com.bytedance.android.livesdkapi.depend.model.a.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;
import f.a.t;
import java.util.Map;

public class a implements IBroadcastService {
    public static boolean hasShown;

    static {
        Covode.recordClassIndex(3668);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a convertStickerBean(Effect effect) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.a createBgBroadcastBinder() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a.a createBgBroadcastFragment(b bVar, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public c createCoverController(Fragment fragment, Room room) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Client createGuestClient(Context context, LiveCore.InteractConfig interactConfig) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.live.broadcast.api.e.b createLinkInRoomView(com.bytedance.android.live.broadcast.api.d.a aVar, Context context, int i2) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdk.chatroom.interact.a createLinkVideoView(Context context, a.C0103a aVar) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public j createLiveBroadcastEndFragment(Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.livesdkapi.depend.model.a.c createLiveBroadcastFragment(b bVar, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public f createStartLiveFragment(com.bytedance.android.livesdkapi.j.a aVar) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Activity getBroadcastActivity() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveComposerFilePath() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveCoreVersion() {
        return "";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Map<String, String> getRoomInfo() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public d getSubscribeEntranceHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment getSubscribeSettingFragment() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public <T> Class<T> getWidgetClass(int i2) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean haveNewFilter() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void init() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public t<Integer> loadShortVideoRes() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void onLiveTabShow(Context context) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setApplyLivePermission(com.bytedance.android.livesdkapi.l.a aVar) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setBroadcastActivity(Activity activity) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setDetailLivePermission(com.bytedance.android.livesdkapi.l.b bVar) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showEndPageForPaidEvent() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showGuideBirthdayEditDialog(Activity activity, String str, String str2, IBroadcastService.a aVar) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public h startLiveManager() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public com.bytedance.android.live.broadcast.api.b.a stickerPresenter() {
        return null;
    }
}
