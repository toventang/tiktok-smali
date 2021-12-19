package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.tools.utils.m;
import dmt.av.video.aj;
import f.a.d.g;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bl {
    static {
        Covode.recordClassIndex(83313);
    }

    private static String a(int i2) {
        if (i2 == 0) {
            return "general_draft_list";
        }
        return null;
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("is_multi_content", k(videoPublishEditModel)).a("from_group_id", dv.a());
        if (videoPublishEditModel.draftId != 0) {
            a2.a("draft_id", videoPublishEditModel.draftId);
        }
        String str = videoPublishEditModel.newDraftId;
        l.b(str, "");
        if (str.length() > 0) {
            a2.a("new_draft_id", videoPublishEditModel.newDraftId);
        }
        if (z) {
            a2.a("is_red_dot", "1");
        } else {
            a2.a("is_red_dot", "0");
        }
        r.a("click_effect_entrance", a2.f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str, int i2, int i3, String str2) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.tools.f.b a2 = l(videoPublishEditModel).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).a("is_subtitle", i2).a("enter_method", str).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel));
        if (com.ss.android.ugc.aweme.property.c.a()) {
            a2.a("is_guidance_text", i3).a("delete_method", str2);
        }
        r.a("text_delete", a2.f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str, String str2, int i2) {
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_method", str).a("enter_from", "video_edit_page").a("filter_name", str2).a("filter_id", i2).a("filter_value", Float.valueOf(videoPublishEditModel.mSelectedFilterIntensity)).a("is_selected_from_entrance", !l.a(str, "slide") ? 1 : 0);
        if (videoPublishEditModel.draftId != 0) {
            a2.a("draft_id", videoPublishEditModel.draftId);
        }
        String str3 = videoPublishEditModel.newDraftId;
        l.b(str3, "");
        if (str3.length() > 0) {
            a2.a("new_draft_id", videoPublishEditModel.newDraftId);
        }
        q.a("select_filter", a2.f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str, int i2, int i3, String str2, boolean z) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        r.a("select_music", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "video_edit_page").a("music_id", str).a("music_selected_method", z ? "auto" : "manual").a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).a("music_show_rank", i2).a("music_rec_type", i3).a("tab_name", str2).f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str, int i2, String str2, int i3) {
        l.d(videoPublishEditModel, "");
        r.a("music_show", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "video_edit_page").a("music_id", str).a("music_rec_type", i2).a("tab_name", str2).a("order", i3).a("shoot_entrance", f.a("shoot_entrance", videoPublishEditModel)).a("mix_type", c(videoPublishEditModel)).f149193a);
    }

    public static final void a(String str, boolean z, int i2, VideoPublishEditModel videoPublishEditModel, String str2) {
        String str3;
        l.d(str, "");
        l.d(videoPublishEditModel, "");
        l.d(str2, "");
        if (z) {
            str3 = "favourite_song";
        } else {
            str3 = "cancel_favourite_song";
        }
        r.a(str3, l(videoPublishEditModel).a("music_id", str).a("enter_from", "video_edit_page").a("mix_type", c(videoPublishEditModel)).a("music_rec_type", i2).a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("shoot_entrance", f.a("shoot_entrance", videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("enter_method", str2).f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId);
        FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.creativeFlowData.getFlowDataMusicInfo();
        r.a("unselect_music", a2.a("music_selected_method", (flowDataMusicInfo == null || !flowDataMusicInfo.isSelectedByAuto()) ? "manual" : "auto").a("enter_from", "video_edit_page").a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("tab_name", str2).a("shoot_way", videoPublishEditModel.mShootWay).a("music_id", str).f149193a);
    }

    public static final String a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return es.c(videoPublishEditModel);
    }

    public static final String b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return es.a(videoPublishEditModel);
    }

    private static final String m(VideoPublishEditModel videoPublishEditModel) {
        String shootPage;
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam == null || (shootPage = storyEditEtParam.getShootPage()) == null) {
            return "video_shoot_page";
        }
        return shootPage;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f126984a;

        static {
            Covode.recordClassIndex(83314);
        }

        a(VideoPublishEditModel videoPublishEditModel) {
            this.f126984a = videoPublishEditModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            return j.fromNullable(aj.a(this.f126984a.videoPath()));
        }
    }

    static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f126989a;

        static {
            Covode.recordClassIndex(83316);
        }

        c(VideoPublishEditModel videoPublishEditModel) {
            this.f126989a = videoPublishEditModel;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            return j.fromNullable(aj.a(this.f126989a.videoPath()));
        }
    }

    public static final void j(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        r.a("text_duration_adjust", a(videoPublishEditModel, false, false, 6).f149193a);
    }

    private static final String n(VideoPublishEditModel videoPublishEditModel) {
        String shootTabName;
        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
        if (storyEditEtParam != null && (shootTabName = storyEditEtParam.getShootTabName()) != null) {
            return shootTabName;
        }
        String e2 = es.e(videoPublishEditModel);
        if (e2 == null) {
            return "";
        }
        return e2;
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f126990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f126991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f126992c;

        static {
            Covode.recordClassIndex(83317);
        }

        d(Intent intent, int i2, VideoPublishEditModel videoPublishEditModel) {
            this.f126990a = intent;
            this.f126991b = i2;
            this.f126992c = videoPublishEditModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String a2;
            j jVar = (j) obj;
            Intent intent = this.f126990a;
            String str = "click_next_button";
            if (!(intent == null || (a2 = a(intent, "enter_edit_page_method")) == null)) {
                str = a2;
            }
            bl.a(this.f126991b, this.f126992c, this.f126990a, (int[]) jVar.orNull(), str);
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final String c(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        p<Integer, Integer> a2 = m.a(videoPublishEditModel);
        return com.ss.android.ugc.aweme.shortvideo.ac.b.a(a2.component1().intValue(), a2.component2().intValue());
    }

    public static final com.ss.android.ugc.tools.f.b d(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = l(videoPublishEditModel).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel));
        l.b(a2, "");
        return a2;
    }

    public static final void g(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        r.a("music_loading", l(videoPublishEditModel).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).f149193a);
    }

    public static final int k(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return 0;
        }
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam == null || !storyEditEtParam.isMultiContent()) {
                return 0;
            }
            return 1;
        } else if ((videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) && videoPublishEditModel.videoCount + videoPublishEditModel.photoCount > 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static final com.ss.android.ugc.tools.f.b l(VideoPublishEditModel videoPublishEditModel) {
        int i2;
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_page", m(videoPublishEditModel)).a("shoot_tab_name", n(videoPublishEditModel));
        if (videoPublishEditModel.storyEditEtParam != null) {
            StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
            if (storyEditEtParam != null) {
                i2 = storyEditEtParam.getClipCount();
            } else {
                i2 = 1;
            }
            a2.a("clips_cnt", i2);
        }
        l.b(a2, "");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0058, code lost:
        if (r0.f() != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.bl.f(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static final void h(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        r.a("click_music_entrance", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "video_edit_page").a("is_multi_content", k(videoPublishEditModel)).a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).f149193a);
    }

    static final long i(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        List<EditVideoSegment> videoList2;
        long j2;
        long j3;
        long j4 = 0;
        if (videoPublishEditModel.isFastImport) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo == null || (videoList2 = previewInfo.getVideoList()) == null) {
                return 0;
            }
            long j5 = 0;
            for (T t : videoList2) {
                VideoCutInfo videoCutInfo = t.getVideoCutInfo();
                if (videoCutInfo != null) {
                    j2 = videoCutInfo.getEnd();
                } else {
                    j2 = 0;
                }
                VideoCutInfo videoCutInfo2 = t.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    j3 = videoCutInfo2.getStart();
                } else {
                    j3 = 0;
                }
                j5 += Math.max(0L, j2 - j3);
            }
            return j5;
        }
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        if (!(previewInfo2 == null || (videoList = previewInfo2.getVideoList()) == null)) {
            Iterator<T> it = videoList.iterator();
            while (it.hasNext()) {
                j4 += it.next().getVideoFileInfo().getDuration();
            }
        }
        return j4;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f126985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.preview.a f126986b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f126987c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f126988d;

        static {
            Covode.recordClassIndex(83315);
        }

        b(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, float f2, String str) {
            this.f126985a = videoPublishEditModel;
            this.f126986b = aVar;
            this.f126987c = f2;
            this.f126988d = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            String str;
            VideoPublishEditModel videoPublishEditModel = this.f126985a;
            com.ss.android.ugc.aweme.shortvideo.preview.a aVar = this.f126986b;
            float f2 = this.f126987c;
            String str2 = this.f126988d;
            int[] iArr = (int[]) ((j) obj).orNull();
            com.bytedance.creativex.editor.preview.a G = aVar.G();
            String sb = new StringBuilder().append(G.getPreviewWidth()).append('*').append(G.getPreviewHeight()).toString();
            com.ss.android.ugc.tools.f.b l2 = bl.l(videoPublishEditModel);
            int i3 = 0;
            if (iArr != null) {
                i2 = iArr[7];
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.tools.f.b a2 = l2.a("file_fps", i2).a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("play_fps", Float.valueOf(f2)).a("next_action", str2).a("beautify_used", com.ss.android.ugc.aweme.beauty.c.b(com.ss.android.ugc.aweme.beauty.c.f68625b)).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.a(com.ss.android.ugc.aweme.beauty.c.f68625b)).a("is_composer", com.ss.android.ugc.aweme.beauty.c.c(com.ss.android.ugc.aweme.beauty.c.f68625b)).a("preview_resolution", sb).a("duration", String.valueOf(bl.i(videoPublishEditModel))).a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds));
            if (com.ss.android.ugc.aweme.property.b.a()) {
                str = "1";
            } else {
                str = "0";
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("is_hardcode", str).a("video_quality", com.ss.android.ugc.aweme.property.b.d()).a("bitrate", Float.valueOf(com.ss.android.ugc.aweme.property.b.c()));
            if (iArr != null) {
                i3 = iArr[6];
            }
            Map<String, String> map = a3.a("file_bitrate", i3).a("resolution", videoPublishEditModel.getVideoResolution()).a("content_type", bl.a(videoPublishEditModel)).a("content_source", bl.b(videoPublishEditModel)).a("prop_list", videoPublishEditModel.mStickerID).a("source_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).f149193a;
            l.b(map, "");
            com.ss.android.ugc.aweme.shortvideo.util.performance.a.a("tool_performance_edit_preview", map);
        }
    }

    public static final void e(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b b2 = l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("filter_name", videoPublishEditModel.mRecordFilterLabels).a("filter_id", videoPublishEditModel.mRecordFilterIds).a("content_type", a(videoPublishEditModel)).a("content_source", b(videoPublishEditModel)).b("is_restore_crash", videoPublishEditModel.isFromCrash());
        if (videoPublishEditModel.draftId != 0) {
            b2.a("draft_id", videoPublishEditModel.draftId);
        }
        String str = videoPublishEditModel.newDraftId;
        l.b(str, "");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "click_back_button";
        if (z) {
            b2.a("new_draft_id", videoPublishEditModel.newDraftId);
            String a2 = a(videoPublishEditModel.mDraftToEditFrom);
            if (a2 != null) {
                b2.a("draft_way", a2);
            }
            b2.a("enter_method", str2);
        }
        if (com.ss.android.ugc.aweme.port.in.g.a().d().f()) {
            str2 = "click_continue_popup";
        }
        b2.a("enter_method", str2);
        String stickers = videoPublishEditModel.getStickers();
        if (!(stickers == null || stickers.length() == 0)) {
            b2.a("prop_id", videoPublishEditModel.getStickers());
        }
        if (TextUtils.equals(videoPublishEditModel.enterFrom, "super_entrance")) {
            b2.a("is_special_icon", 1);
        }
        if (videoPublishEditModel.isShoutout()) {
            b2.a("shoot_entrance", videoPublishEditModel.mShootWay);
            b2.a("reviewed", videoPublishEditModel.mShoutOutsData.getReviewed());
            if (!TextUtils.isEmpty(videoPublishEditModel.mShoutOutsData.getOrderId())) {
                b2.a(com.ss.android.ugc.aweme.shoutouts.d.MOD_ORDER_ID, videoPublishEditModel.mShoutOutsData.getOrderId());
            }
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.clientId)) {
            b2.a("channel", videoPublishEditModel.clientId);
        }
        b2.a("is_westwindow_exist", videoPublishEditModel.isWestWindowExistStr);
        if (!TextUtils.isEmpty(videoPublishEditModel.shareId)) {
            b2.a("open_platform_share_id", videoPublishEditModel.shareId);
        }
        r.a("enter_video_shoot_page", b2.f149193a);
    }

    public static final void c(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        r.a("enter_edit_subtitle", d(videoPublishEditModel).a("enter_method", str).f149193a);
    }

    public static final void b(VideoPublishEditModel videoPublishEditModel, boolean z) {
        l.d(videoPublishEditModel, "");
        r.a("prop_duration_adjust", a(videoPublishEditModel, z, false, 4).f149193a);
    }

    public static final void b(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        r.a("click_auto_subtitle", l(videoPublishEditModel).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_id", videoPublishEditModel.creationId).a("enter_method", str).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("is_multi_content", k(videoPublishEditModel)).f149193a);
    }

    public static final void d(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        r.a("click_music_tab", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "video_edit_page").a("tab_name", str).f149193a);
    }

    public static final void e(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        r.a("click_music_tab", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "video_edit_page").a("tab_name", str).f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(videoPublishEditModel, "");
        r.a("edit_music", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("shoot_way", videoPublishEditModel.mShootWay).a("music_id", videoPublishEditModel.musicId).a("music_rec_type", i2).a("can_music_loop", 0).a("enter_from", "video_edit_page").f149193a);
    }

    public static final void f(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        r.a("enter_music_tab", l(videoPublishEditModel).a("enter_from", "video_edit_page").a("shoot_way", videoPublishEditModel.mShootWay).a("creation_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()).a("content_source", b(videoPublishEditModel)).a("content_type", a(videoPublishEditModel)).a("creation_id", videoPublishEditModel.creationId).a("tab_name", str).f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        r.a("click_text_entrance", l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("enter_method", str).a("shoot_way", videoPublishEditModel.mShootWay).a("content_type", a(videoPublishEditModel)).a("content_source", b(videoPublishEditModel)).a("is_multi_content", k(videoPublishEditModel)).a("enter_from", "video_edit_page").f149193a);
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, int i2, long j2, String str) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        r.a("auto_subtitle_end", d(videoPublishEditModel).a("video_duration", i2).a("load_time", SystemClock.elapsedRealtime() - j2).a("load_status", str).f149193a);
    }

    public static /* synthetic */ com.ss.android.ugc.tools.f.b a(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.tools.f.b a2 = l(videoPublishEditModel).a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("content_type", a(videoPublishEditModel)).a("content_source", b(videoPublishEditModel)).a("enter_from", "video_edit_page");
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        com.ss.android.ugc.tools.f.b a3 = a2.a("is_diy_prop", i3);
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        com.ss.android.ugc.tools.f.b a4 = a3.a("is_text_reading", i6);
        l.b(a4, "");
        return a4;
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.preview.a aVar, float f2, String str) {
        l.d(videoPublishEditModel, "");
        l.d(aVar, "");
        l.d(str, "");
        t.b(videoPublishEditModel).a(f.a.h.a.b(f.a.k.a.f158006c)).d(new a(videoPublishEditModel)).d(new b(videoPublishEditModel, aVar, f2, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(int r16, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, android.content.Intent r18, int[] r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 1277
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.bl.a(int, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.content.Intent, int[], java.lang.String):void");
    }
}
