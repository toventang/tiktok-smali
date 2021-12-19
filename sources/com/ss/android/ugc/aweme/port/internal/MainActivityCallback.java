package com.ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.live.k;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.et;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import com.ss.android.ugc.aweme.shortvideo.publish.h;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.x;
import com.ss.android.ugc.aweme.story.model.b;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;

public class MainActivityCallback implements x<ai>, x {

    /* renamed from: a  reason: collision with root package name */
    h f115660a;

    /* renamed from: b  reason: collision with root package name */
    a f115661b;

    /* renamed from: c  reason: collision with root package name */
    public IAVPublishService f115662c;

    /* renamed from: d  reason: collision with root package name */
    public q f115663d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f115664e;

    /* renamed from: f  reason: collision with root package name */
    private final String f115665f;

    /* renamed from: g  reason: collision with root package name */
    private j f115666g;

    /* renamed from: h  reason: collision with root package name */
    private e f115667h;

    static {
        Covode.recordClassIndex(74620);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onParallelPublishCancel() {
        Publish.isInPublish = false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onParallelPublishPause() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onParallelPublishResume() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onProgressUpdate(int i2, boolean z) {
    }

    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onSynthetiseSuccess(String str) {
    }

    private void a() {
        h hVar = this.f115660a;
        if (hVar != null) {
            hVar.b(this);
        }
        this.f115660a = null;
        this.f115661b = null;
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        if (!this.f115667h.getClass().equals(AVExternalServiceImpl.a().classnameService().getVideoPublishActivityClass())) {
            a();
        }
    }

    public static boolean a(Activity activity) {
        if ((activity instanceof MainActivity) || (activity instanceof k)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onError(et etVar) {
        h hVar;
        String str;
        Publish.isInPublish = false;
        a aVar = this.f115661b;
        if (!(aVar == null || (hVar = this.f115660a) == null)) {
            int b2 = hVar.b();
            Object a2 = this.f115660a.a();
            a.a("onError " + b2 + " and args is " + a2);
            e eVar = aVar.f115670a;
            c.a(new b(1, null));
            if (etVar.isCauseByApiServerException()) {
                str = ((com.ss.android.ugc.aweme.base.api.a.b.a) etVar.getCause()).getErrorMsg();
            } else {
                str = null;
            }
            if (etVar.isCauseByNoSpaceLeft()) {
                str = eVar.getString(R.string.g8k);
            } else if (etVar.isUserNetworkBad()) {
                str = eVar.getString(R.string.g8h);
            }
            if (TextUtils.isEmpty(str)) {
                str = eVar.getString(R.string.f0q);
            }
            f fVar = new f(9, 99, null, str);
            fVar.f128582f = etVar.isRecover();
            fVar.f128583g = etVar.isCauseByApiServerException();
            if (aVar.f115672c && a.a()) {
                fVar.f128587k = true;
            } else if (aVar.f115672c || aVar.f115673d) {
                fVar.f128588l = true;
            }
            if (a2 instanceof BaseShortVideoContext) {
                fVar.f128589m = ((BaseShortVideoContext) a2).getDraftPrimaryKey();
            }
            c.b(fVar);
            if (!aVar.f115672c && !aVar.f115673d && aVar.f115671b && !com.ss.android.ugc.aweme.compliance.api.a.c().a(1)) {
                new com.bytedance.tux.g.b(eVar).a(str).b();
            }
        }
        a();
    }

    public MainActivityCallback(e eVar, String str) {
        this(eVar, str, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x
    public void onSuccess(ai aiVar, boolean z) {
        boolean z2;
        boolean z3;
        String videoCoverPath;
        Publish.isInPublish = false;
        if (!(this.f115661b == null || !(aiVar instanceof CreateAwemeResponse) || this.f115660a == null)) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) aiVar;
            String str = "";
            if (!(createAwemeResponse == null || createAwemeResponse.aweme == null || createAwemeResponse.aweme.getVideo() == null || (videoCoverPath = createAwemeResponse.getVideoCoverPath()) == null)) {
                Aweme aweme = createAwemeResponse.aweme;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Uri.fromFile(new File(videoCoverPath)).toString());
                Video video = aweme.getVideo();
                if (video != null) {
                    if (video.getCover() != null) {
                        video.getCover().setUrlList(arrayList);
                    }
                    if (video.getDynamicCover() != null) {
                        video.getDynamicCover().setUrlList(arrayList);
                    }
                    j jVar = this.f115666g;
                    String aid = aweme.getAid();
                    l.d(videoCoverPath, str);
                    if (aid != null) {
                        jVar.f115677a.storeString(aid, videoCoverPath);
                    }
                }
            }
            a aVar = this.f115661b;
            int b2 = this.f115660a.b();
            Object a2 = this.f115660a.a();
            a.a("onSuccess " + b2 + " and response is " + aiVar.status_code + " extra is " + aiVar.extra);
            if (!(createAwemeResponse.aweme == null || createAwemeResponse.aweme.getVideo() == null)) {
                Video video2 = createAwemeResponse.aweme.getVideo();
                if (video2.getWidth() == 0 && video2.getHeight() == 0) {
                    video2.setWidth(aiVar.realVideoWidth);
                    video2.setHeight(aiVar.realVideoHeight);
                }
            }
            if (b2 == 0) {
                LocalVideoPlayerManager.a().a(AVExternalServiceImpl.a().infoService().convertToExposureData(a2).getOutPutFile(), createAwemeResponse.aweme);
            }
            b bVar = new b(2, createAwemeResponse.aweme);
            bVar.f138041g = createAwemeResponse.notify;
            bVar.f138042h = createAwemeResponse.notifyExtra;
            boolean z4 = a2 instanceof BaseShortVideoContext;
            if (z4) {
                bVar.f138040f = ((BaseShortVideoContext) a2).mSyncPlatforms;
            }
            if (createAwemeResponse.isReviewVideo == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (createAwemeResponse.hasStickerRedPacket) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 || z3 || a.a(aiVar)) {
                bVar.f138041g = new String[0];
                bVar.f138040f = null;
                bVar.f138042h = null;
            }
            c.b(bVar);
            if (!a.a(aiVar)) {
                CreateAwemeResponse.b bVar2 = createAwemeResponse.responseMarker;
                if (!(bVar2 == null || bVar2.addToPlaylistFail == null || !bVar2.addToPlaylistFail.booleanValue())) {
                    new com.bytedance.tux.g.b(aVar.f115670a).a(aVar.f115670a.getResources().getString(R.string.br8)).b();
                }
                Aweme aweme2 = createAwemeResponse.aweme;
                if (createAwemeResponse.aweme.getAwemeType() == 40) {
                    aweme2 = com.ss.android.ugc.aweme.story.d.a.l(createAwemeResponse.aweme);
                }
                c.b(new ag(15, aweme2));
            } else {
                new com.bytedance.tux.g.b(aVar.f115670a).e(R.string.gja).b();
                d dVar = new d();
                if (aiVar.shoutoutData != null && !aiVar.shoutoutData.getShoutOutsMode().equals(com.ss.android.ugc.aweme.shoutouts.d.MODE_SEND)) {
                    e.a.f91018a.b("shoutouts_edit_post_success_time_" + com.ss.android.ugc.aweme.account.b.g().getCurUserId(), new StringBuilder().append(System.currentTimeMillis()).toString());
                }
                if (aiVar.shoutoutData != null) {
                    dVar.a("reviewed", aiVar.shoutoutData.getReviewed());
                    if (!TextUtils.isEmpty(aiVar.shoutoutData.getOrderId())) {
                        dVar.a("enter_from", "video_edit_page");
                        dVar.a("order_id", aiVar.shoutoutData.getOrderId());
                    } else {
                        dVar.a("enter_from", "shoutouts_post_page");
                    }
                    r.a("show_review_remind_pop_up", dVar.f66730a);
                }
            }
            if (createAwemeResponse.aweme == null) {
                n.a("aweme_publish_error", new com.ss.android.ugc.aweme.app.f.c().a("user_info", "videoType:" + b2 + "response: " + aiVar.status_code + " " + aiVar.extra).a());
            }
            if (z4) {
                com.ss.android.ugc.aweme.discover.hitrank.b.a((BaseShortVideoContext) a2);
            }
            if (b2 == 0) {
                VideoExposureData convertToExposureData = AVExternalServiceImpl.a().infoService().convertToExposureData(a2);
                new Object();
                f fVar = new f(createAwemeResponse.aweme);
                fVar.f128585i = ((BaseShortVideoContext) a2).excludeUserList;
                fVar.f128584h = aiVar;
                fVar.f128586j = convertToExposureData.getShootWay();
                if (aVar.f115672c && a.a()) {
                    fVar.f128587k = true;
                    c.a(fVar);
                } else if (aVar.f115672c || aVar.f115673d) {
                    c.b(fVar);
                } else {
                    c.b(fVar);
                    if (aVar.f115671b) {
                        new com.bytedance.tux.g.b(aVar.f115670a).e(R.string.h75).b();
                    }
                }
                d a3 = new d().a("creation_id", convertToExposureData.getCreationId());
                if (createAwemeResponse.aweme != null) {
                    str = createAwemeResponse.aweme.getAid();
                }
                r.a("video_publish_done", a3.a("group_id", str).f66730a);
            }
            ProfileBadgeServiceImpl.b().a();
        }
        a();
    }

    public MainActivityCallback(androidx.fragment.app.e eVar, String str, boolean z) {
        this.f115665f = "MainActivityCallback";
        this.f115666g = new j();
        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
        this.f115662c = publishService;
        q publishModel = publishService.getPublishModel(str);
        this.f115663d = publishModel;
        if (publishModel == null) {
            Toast makeText = Toast.makeText(eVar, (int) R.string.brg, 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
            String concat = "MainActivityCallback getPublishModelFailed publishId:".concat(String.valueOf(str));
            bj.b(concat);
            com.bytedance.c.a.a.a.b.a(concat);
            return;
        }
        this.f115664e = true;
        this.f115667h = eVar;
        eVar.runOnUiThread(new k(this, eVar, str, z));
    }
}
