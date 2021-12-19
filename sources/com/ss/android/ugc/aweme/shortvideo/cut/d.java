package com.ss.android.ugc.aweme.shortvideo.cut;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.ss.android.ugc.aweme.api.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ad;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.ae;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.b;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.h;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.b.e;
import com.ss.android.ugc.aweme.tools.b.g;
import com.ss.android.ugc.aweme.utils.hk;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f125451a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(82341);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Intent intent, b bVar) {
        List<VideoSegment> list = bVar.f125663a;
        StringBuilder sb = new StringBuilder();
        for (VideoSegment videoSegment : list) {
            if (!TextUtils.isEmpty(videoSegment.f125489m)) {
                sb.append(videoSegment.f125489m).append(",");
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        if (!TextUtils.isEmpty(sb2)) {
            Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
            String substring = sb2.substring(0, sb2.length() - 1);
            l.b(substring, "");
            intent.putExtra("md5", substring);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ad adVar, Intent intent) {
        t tVar;
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        int i2;
        boolean z;
        Integer height;
        Integer width;
        Workspace workspace;
        l.d(adVar, "");
        l.d(intent, "");
        adVar.f125555d = intent.getLongExtra("min_duration", di.a());
        String a2 = a(intent, "path");
        if (!TextUtils.isEmpty(a2) && (workspace = adVar.f125560i) != null) {
            workspace.a(a2);
        }
        if (intent.getSerializableExtra("av_challenge") != null) {
            adVar.f125556e.clear();
            ArrayList<AVChallenge> arrayList = adVar.f125556e;
            Serializable serializableExtra = intent.getSerializableExtra("av_challenge");
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
            arrayList.add(serializableExtra);
        }
        if (intent.getSerializableExtra("av_challenge_list") != null) {
            Serializable serializableExtra2 = intent.getSerializableExtra("av_challenge_list");
            Objects.requireNonNull(serializableExtra2, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
            ArrayList<AVChallenge> arrayList2 = (ArrayList) serializableExtra2;
            l.d(arrayList2, "");
            adVar.f125556e = arrayList2;
        }
        adVar.f125557f = a(intent, "micro_app_id");
        String str5 = null;
        if (intent.getSerializableExtra("micro_app_info") == null) {
            tVar = null;
        } else {
            Serializable serializableExtra3 = intent.getSerializableExtra("micro_app_info");
            Objects.requireNonNull(serializableExtra3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
            tVar = (t) serializableExtra3;
        }
        adVar.f125558g = tVar;
        adVar.v.setExtraShareOptions((HashMap) intent.getSerializableExtra("_aweme_open_sdk_extra_share_options"));
        int i3 = 0;
        adVar.f125559h = intent.getBooleanExtra("enter_record_from_other_platform", false);
        adVar.f125561j = (com.ss.android.ugc.aweme.common.ad) intent.getSerializableExtra("extra_share_context");
        adVar.f125562k = intent.getIntExtra("extra_stick_point_type", 0);
        adVar.f125563l = a(intent, "shoot_way");
        adVar.u = (com.ss.android.ugc.aweme.shoutouts.d) intent.getSerializableExtra("shout_out_data");
        CreativeFlowData creativeFlowData = (CreativeFlowData) intent.getParcelableExtra("creative_flow_data");
        if (creativeFlowData != null) {
            l.d(creativeFlowData, "");
            adVar.v = creativeFlowData;
        }
        adVar.p = a(intent, "music_origin");
        adVar.f125564m = intent.getBooleanExtra("from_background_video", false);
        adVar.C = (BackgroundVideoCompileConfigure) intent.getParcelableExtra("background_video_compile_configure");
        adVar.n = intent.getLongExtra("background_video_max_length", 15000);
        adVar.o = a(intent, "creation_id");
        adVar.s = a(intent, "share_id");
        adVar.t = a(intent, "channel");
        adVar.w = intent.getIntExtra("is_rivate", 0);
        adVar.r = intent.getBooleanExtra("draft_to_cut", false);
        adVar.q = intent.getBooleanExtra("extra_enter_from_live", false);
        adVar.y = intent.getLongExtra("extra_start_enter_cut_page", System.currentTimeMillis());
        adVar.z = (a) intent.getSerializableExtra("auto_selected_anchor");
        adVar.B = a(intent, "open_platform_client_key");
        adVar.A = a(intent, "open_platform_extra");
        com.ss.android.ugc.aweme.common.ad adVar2 = adVar.f125561j;
        if (adVar2 != null) {
            str = adVar2.mAnchorSourceType;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.common.ad adVar3 = adVar.f125561j;
            if (adVar3 != null) {
                str2 = adVar3.mClientKey;
            } else {
                str2 = null;
            }
            com.ss.android.ugc.aweme.common.ad adVar4 = adVar.f125561j;
            if (adVar4 != null) {
                str3 = adVar4.mOpenPlatformExtra;
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.common.ad adVar5 = adVar.f125561j;
            if (adVar5 != null) {
                str4 = adVar5.mAnchorSourceType;
            } else {
                str4 = null;
            }
            i<com.ss.android.ugc.aweme.api.a> a3 = AnchorAutoSelectionService.a.a(str2, str3, str4, 3);
            a3.f();
            com.ss.android.ugc.aweme.api.a d2 = a3.d();
            if (d2 != null && d2.f66440a == 0 && d2.f66442c != null) {
                CreateAnchorInfo createAnchorInfo = d2.f66442c;
                if (createAnchorInfo == null) {
                    l.b();
                }
                UrlModel urlModel = new UrlModel();
                f fVar = d2.f66444e;
                if (fVar != null) {
                    list = fVar.getUrlList();
                } else {
                    list = null;
                }
                urlModel.setUrlList(list);
                f fVar2 = d2.f66444e;
                if (fVar2 != null) {
                    str5 = fVar2.getUri();
                }
                urlModel.setUri(str5);
                f fVar3 = d2.f66444e;
                if (fVar3 == null || (width = fVar3.getWidth()) == null) {
                    i2 = 0;
                } else {
                    i2 = width.intValue();
                }
                urlModel.setWidth(i2);
                f fVar4 = d2.f66444e;
                if (!(fVar4 == null || (height = fVar4.getHeight()) == null)) {
                    i3 = height.intValue();
                }
                urlModel.setHeight(i3);
                int type = createAnchorInfo.getType();
                String content = createAnchorInfo.getContent();
                String keyword = createAnchorInfo.getKeyword();
                String url = createAnchorInfo.getUrl();
                String extra = createAnchorInfo.getExtra();
                Boolean bool = d2.f66443d;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                adVar.z = new a(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, 5672, null);
            }
        }
    }

    public static Intent a(Intent intent, ad adVar, b bVar, long j2) {
        boolean z;
        int i2;
        int i3;
        l.d(adVar, "");
        l.d(bVar, "");
        List<VideoSegment> list = bVar.f125663a;
        Workspace workspace = adVar.f125560i;
        Intent intent2 = new Intent(intent);
        intent2.putExtra("dir", di.f126461d);
        intent2.putExtra("extra_start_enter_edit_page", j2);
        intent2.putExtra("extra_import_compile_cost_time", System.currentTimeMillis() - j2);
        intent2.putExtra("content_source", "upload");
        intent2.putExtra("content_type", h.a(bVar.f125665c));
        intent2.putExtra("enable_music_path_check", false);
        intent2.putExtra("fromCut", true);
        intent2.putExtra("origin", 0);
        intent2.putExtra("extra_stick_point_type", adVar.f125562k);
        intent2.putExtra("shout_out_data", adVar.u);
        intent2.putExtra("is_rivate", adVar.w);
        intent2.putExtra("share_id", adVar.s);
        intent2.putExtra("channel", adVar.t);
        l.d(adVar, "");
        if (adVar.f125558g != null || !TextUtils.isEmpty(adVar.f125557f)) {
            z = false;
        } else {
            z = true;
        }
        intent2.putExtra("back_to_main_after_publish", z);
        ArrayList<AVChallenge> arrayList = adVar.f125556e;
        Objects.requireNonNull(arrayList, "null cannot be cast to non-null type java.io.Serializable");
        intent2.putExtra("challenge", arrayList);
        intent2.putExtra("enter_record_from_other_platform", ae.a(adVar));
        intent2.putExtra("micro_app_id", adVar.f125557f);
        intent2.putExtra("micro_app_info", adVar.f125558g);
        intent2.putExtra("music_origin", adVar.p);
        intent2.putExtra("creative_flow_data", (Parcelable) adVar.v);
        intent2.putExtra("upload_video_type", bVar.f125666d);
        intent2.putExtra("extra_is_change_speed", bVar.f125667e);
        intent2.putExtra("fromMultiCut", bVar.f125666d);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().x && (i2 = i2 + 1) < 0) {
                    n.b();
                }
            }
        } else {
            i2 = 0;
        }
        intent2.putExtra("extra_photo_count", i2);
        intent2.putExtra("extra_video_count", list.size() - i2);
        if (bVar.f125665c) {
            i3 = -1;
        } else {
            i3 = (int) bVar.f125664b;
        }
        intent2.putExtra("preview_video_length", i3);
        a(intent2, bVar);
        String a2 = a(intent, "hashtag");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        k.a(adVar.f125558g, sb, arrayList2);
        if (sb.length() == 0 && hk.a(a2)) {
            String[] strArr = new String[1];
            if (a2 == null) {
                a2 = "";
            }
            strArr[0] = a2;
            k.a(n.d(strArr), sb);
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            intent2.putExtra("video_title", sb.toString());
        }
        if (!arrayList2.isEmpty()) {
            intent2.putExtra("struct_list", arrayList2);
        }
        intent2.putExtra("extra_stickpoint_mode", bVar.f125665c);
        if (bVar.f125665c) {
            String c2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(bVar.f125668f);
            Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
            l.b(application, "");
            Context applicationContext = application.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            if (com.ss.android.ugc.aweme.shortvideo.af.b.a(c2, applicationContext) && workspace != null) {
                workspace.a(c2);
            }
            cr.a().a(bVar.f125668f);
        }
        if (bVar.f125666d) {
            if (bVar.f125665c) {
                cr.a().a(bVar.f125668f);
            } else {
                if (workspace != null) {
                    workspace.d();
                }
                cr.a().a((c) null);
            }
        }
        intent2.putExtra("auto_selected_anchor", adVar.z);
        intent2.putExtra("open_platform_client_key", adVar.B);
        intent2.putExtra("open_platform_extra", adVar.A);
        long j3 = 0;
        Iterator<T> it2 = bVar.f125663a.iterator();
        while (it2.hasNext()) {
            j3 += it2.next().f125478b;
        }
        intent2.putExtra("extra_import_total_video_duration", j3);
        g.a(intent, intent2, e.CUT, e.EDIT);
        return intent2;
    }
}
