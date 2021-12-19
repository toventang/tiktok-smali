package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.MarqueeView2;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.IMusicRecordService;
import com.ss.android.ugc.aweme.music.service.e;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

public final class v extends y {

    /* renamed from: a  reason: collision with root package name */
    private boolean f79754a;
    private Music bx;
    private String by;
    private String bz;

    static {
        Covode.recordClassIndex(49563);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final int o() {
        return R.string.h7v;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final void n() {
        String str;
        int i2;
        boolean z;
        if (this.bx != null) {
            if (this.bv == null || !MSAdaptionService.c().b(this.bv)) {
                String str2 = null;
                Aweme aD = aD();
                String str3 = "";
                if (aD != null) {
                    if (!dq.a() || in.e() || !Aweme.containsGreenScreenGiphyAnchor(aD.getAnchors())) {
                        str = str3;
                    } else {
                        str = aD.getGiphyGifIds();
                    }
                    str2 = aD.getStickerIDs();
                    if (aD.getVideo() != null) {
                        i2 = aD.getVideo().getVideoLength();
                    }
                    i2 = 0;
                } else {
                    str = str3;
                    i2 = 0;
                }
                e eVar = new e();
                boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                boolean isRecording = AVExternalServiceImpl.a().configService().shortVideoConfig().isRecording();
                Fragment az_ = az_();
                Activity activity = this.bv;
                MusicModel convertToMusicModel = this.bx.convertToMusicModel();
                AnonymousClass1 r11 = new IMusicRecordService.a() {
                    /* class com.ss.android.ugc.aweme.detail.h.v.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(49564);
                    }
                };
                if (!downloadEffectOrMusicAfterEnterCamera || (isRecording && this.bv != null)) {
                    z = false;
                } else {
                    z = true;
                }
                eVar.startRecord(az_, activity, convertToMusicModel, str2, str, r11, i2, z);
                d a2 = new d().a("enter_method", "music_feed").a("music_id", this.bx.getId()).a("creation_id", UUID.randomUUID().toString()).a("enter_from", "single_song").a("shoot_way", "single_song").a("group_id", this.bz);
                if (!TextUtils.isEmpty(str)) {
                    str3 = str.split(",")[0];
                }
                r.a("shoot", a2.a("giphy_id", str3).f66730a);
                return;
            }
            Toast makeText = Toast.makeText(this.bv, this.bv.getString(R.string.bey), 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.y
    public final View a(RelativeLayout relativeLayout) {
        View a2 = a.a(LayoutInflater.from(this.bv), R.layout.wq, relativeLayout, false);
        RemoteImageView remoteImageView = (RemoteImageView) a2.findViewById(R.id.cqi);
        remoteImageView.setVisibility(0);
        com.ss.android.ugc.aweme.base.e.a(remoteImageView, 2131231900);
        if (this.bx != null) {
            MarqueeView2 marqueeView2 = (MarqueeView2) a2.findViewById(R.id.b1o);
            if (this.bx.getMatchedPGCSoundInfo() != null && !TextUtils.isEmpty(this.bx.getMatchedPGCSoundInfo().getMixedTitle())) {
                a(marqueeView2, this.bx.getMatchedPGCSoundInfo().getMixedTitle());
            } else if (this.f79754a || this.bx.getMatchedPGCSoundInfo() == null || TextUtils.isEmpty(this.bx.getMatchedPGCSoundInfo().getShowInfo())) {
                a(marqueeView2, this.bv.getResources().getString(R.string.dd0, this.bx.getMusicName(), "@" + this.bx.getAuthorName()));
            } else {
                a(marqueeView2, this.bv.getResources().getString(R.string.dd0, this.bx.getMusicName(), this.bx.getAuthorName()));
            }
        }
        return a2;
    }

    public v(Bundle bundle, b bVar) {
        this.bx = (Music) bundle.getSerializable("feed_data_music");
        this.f79754a = bundle.getBoolean("feed_data_is_ad", false);
        this.bz = bundle.getString("id");
        this.by = bundle.getString("feed_data_author_id");
        bVar.setHideMusicText(true);
    }
}
