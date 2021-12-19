package com.ss.android.ugc.aweme.story.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.story.base.model.ETParams;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.aweme.tools.k;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(89603);
    }

    static final String b(StoryEditModel storyEditModel) {
        if (storyEditModel.getOrigin() == 0) {
            return "upload";
        }
        return "shoot";
    }

    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.tools.f.b, z> {
        final /* synthetic */ long $compileTime;
        final /* synthetic */ long $totalTime;

        static {
            Covode.recordClassIndex(89606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(long j2, long j3) {
            super(1);
            this.$totalTime = j2;
            this.$compileTime = j3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.tools.f.b bVar) {
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a("first_frame_duration", this.$totalTime);
            bVar2.a("compile_time", this.$compileTime);
            return z.f158842a;
        }
    }

    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.tools.f.b, z> {
        final /* synthetic */ String $effectId;
        final /* synthetic */ String $effectName;

        static {
            Covode.recordClassIndex(89607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(1);
            this.$effectName = str;
            this.$effectId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.tools.f.b bVar) {
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a("effect_name", this.$effectName);
            bVar2.a("effect_id", this.$effectId);
            return z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<com.ss.android.ugc.tools.f.b, z> {
        final /* synthetic */ boolean $isMute;

        static {
            Covode.recordClassIndex(89608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.$isMute = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            l.d(bVar2, "");
            if (this.$isMute) {
                str = "mute";
            } else {
                str = "unmute";
            }
            bVar2.a("to_status", str);
            return z.f158842a;
        }
    }

    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.tools.f.b, z> {
        final /* synthetic */ StoryEditModel $editModel;
        final /* synthetic */ boolean $isInTab;

        static {
            Covode.recordClassIndex(89604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(StoryEditModel storyEditModel, boolean z) {
            super(1);
            this.$editModel = storyEditModel;
            this.$isInTab = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            ETParams etParams;
            ETParams etParams2;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            l.d(bVar2, "");
            EditContext editContext = this.$editModel.getEditContext();
            String str2 = null;
            if (editContext == null || (etParams2 = editContext.getEtParams()) == null) {
                str = null;
            } else {
                str = etParams2.getEnterMethod();
            }
            bVar2.a("shoot_enter_method", str);
            EditContext editContext2 = this.$editModel.getEditContext();
            if (!(editContext2 == null || (etParams = editContext2.getEtParams()) == null)) {
                str2 = etParams.getRecordWay();
            }
            bVar2.a("record_way", str2);
            bVar2.a("is_in_tab", this.$isInTab ? 1 : 0);
            b.a(bVar2, this.$editModel);
            return z.f158842a;
        }
    }

    static final String a(StoryEditModel storyEditModel) {
        boolean z;
        List<StoryEditClipModel> clips = storyEditModel.getClips();
        boolean z2 = false;
        if (!(clips instanceof Collection) || !clips.isEmpty()) {
            Iterator<T> it = clips.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getSourceContentType() != 1) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        List<StoryEditClipModel> clips2 = storyEditModel.getClips();
        if (!(clips2 instanceof Collection) || !clips2.isEmpty()) {
            Iterator<T> it2 = clips2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().getSourceContentType() != 2) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = true;
        if (z) {
            return "video";
        }
        if (!z2) {
            return "multi";
        }
        return UGCMonitor.TYPE_PHOTO;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$b  reason: collision with other inner class name */
    static final class C3589b extends m implements h.f.a.b<com.ss.android.ugc.tools.f.b, z> {
        final /* synthetic */ StoryEditModel $editModel;

        static {
            Covode.recordClassIndex(89605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3589b(StoryEditModel storyEditModel) {
            super(1);
            this.$editModel = storyEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            String str2;
            String str3;
            String str4;
            int i2;
            String str5;
            String str6;
            ETParams etParams;
            ETParams etParams2;
            StickerInfo stickerInfo;
            StickerInfo stickerInfo2;
            EditPreviewInfo previewMediaInfo;
            List<EditVideoSegment> videoList;
            EditVideoSegment editVideoSegment;
            VideoFileInfo videoFileInfo;
            String g2;
            ETParams etParams3;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            String str7 = "";
            l.d(bVar2, str7);
            bVar2.a("shoot_entrance", "story");
            EditContext editContext = this.$editModel.getEditContext();
            Float f2 = null;
            if (editContext == null || (etParams3 = editContext.getEtParams()) == null) {
                str = null;
            } else {
                str = etParams3.getRecordWay();
            }
            bVar2.a("record_way", str);
            if (com.ss.android.ugc.aweme.property.b.a()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            bVar2.a("is_hardcode", str2);
            bVar2.a("bite_rate", String.valueOf(com.ss.android.ugc.aweme.property.b.c()));
            EditContext editContext2 = this.$editModel.getEditContext();
            if (editContext2 == null || (str3 = editContext2.getStickers()) == null) {
                str3 = str7;
            }
            bVar2.a("prop_list", str3);
            EditContext editContext3 = this.$editModel.getEditContext();
            if (editContext3 == null || (str4 = editContext3.getStickers()) == null) {
                str4 = str7;
            }
            bVar2.a("prop_id", str4);
            StoryEditModel storyEditModel = this.$editModel;
            l.d(storyEditModel, str7);
            StoryEditClipModel storyEditClipModel = (StoryEditClipModel) n.h((List) storyEditModel.getClips());
            if (!(storyEditClipModel == null || (g2 = com.ss.android.ugc.aweme.story.edit.model.a.g(storyEditClipModel)) == null)) {
                str7 = g2;
            }
            bVar2.a("resolution", str7);
            bVar2.a("video_quality", com.ss.android.ugc.aweme.property.b.d());
            StoryEditClipModel storyEditClipModel2 = (StoryEditClipModel) n.h((List) this.$editModel.getClips());
            if (storyEditClipModel2 == null || (previewMediaInfo = storyEditClipModel2.getPreviewMediaInfo()) == null || (videoList = previewMediaInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) n.h((List) videoList)) == null || (videoFileInfo = editVideoSegment.getVideoFileInfo()) == null) {
                i2 = 0;
            } else {
                i2 = videoFileInfo.getBitrate();
            }
            bVar2.a("file_bitrate", i2);
            EditContext editContext4 = this.$editModel.getEditContext();
            if (editContext4 != null) {
                str5 = editContext4.isWestWindowExist();
            } else {
                str5 = null;
            }
            bVar2.a("is_westwindow_exist", str5);
            EditContext editContext5 = this.$editModel.getEditContext();
            if (!(editContext5 == null || (stickerInfo2 = editContext5.getStickerInfo()) == null || !stickerInfo2.hasTabOrder())) {
                bVar2.a("prop_tab_order", stickerInfo2.getTabOrder());
            }
            EditContext editContext6 = this.$editModel.getEditContext();
            if (!(editContext6 == null || (stickerInfo = editContext6.getStickerInfo()) == null || !stickerInfo.hasImprPosition())) {
                bVar2.a("prop_impr_position", stickerInfo.getImprPosition());
            }
            EditContext editContext7 = this.$editModel.getEditContext();
            if (editContext7 == null || (etParams2 = editContext7.getEtParams()) == null) {
                str6 = null;
            } else {
                str6 = etParams2.getEnterMethod();
            }
            bVar2.a("shoot_enter_method", str6);
            EditContext editContext8 = this.$editModel.getEditContext();
            if (!(editContext8 == null || (etParams = editContext8.getEtParams()) == null)) {
                f2 = Float.valueOf(etParams.getZoom());
            }
            bVar2.a("zoom_value", f2);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<com.ss.android.ugc.tools.f.b, z> {
        final /* synthetic */ StoryEditClipModel $clipModel;
        final /* synthetic */ StoryEditModel $editModel;
        final /* synthetic */ int $index;
        final /* synthetic */ VideoPublishEditModel $model;

        static {
            Covode.recordClassIndex(89609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(StoryEditClipModel storyEditClipModel, StoryEditModel storyEditModel, int i2, VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.$clipModel = storyEditClipModel;
            this.$editModel = storyEditModel;
            this.$index = i2;
            this.$model = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            int i2;
            StickerInfo stickerInfo;
            ETParams etParams;
            InfoStickerModel infoStickerModel;
            List<StickerItemModel> list;
            ETParams etParams2;
            ETParams etParams3;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            l.d(bVar2, "");
            if (this.$clipModel.getSourceContentType() == 2) {
                str = UGCMonitor.TYPE_PHOTO;
            } else {
                str = "video";
            }
            bVar2.a("content_type", str);
            bVar2.a("enter_from", "video_edit_page");
            EditContext editContext = this.$editModel.getEditContext();
            Object obj = null;
            if (editContext == null || (etParams3 = editContext.getEtParams()) == null) {
                str2 = null;
            } else {
                str2 = etParams3.getRecordWay();
            }
            bVar2.a("record_way", str2);
            bVar2.a("clip_index", this.$index);
            bVar2.a("filter_list", this.$clipModel.getMCurFilterLabels());
            bVar2.a("filter_id_list", VideoPublishEditModel.translateNullFilter(this.$clipModel.getMCurFilterIds()));
            if (com.ss.android.ugc.aweme.property.b.a()) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            bVar2.a("is_hardcode", str3);
            bVar2.a("bite_rate", String.valueOf(com.ss.android.ugc.aweme.property.b.c()));
            bVar2.a("video_quality", com.ss.android.ugc.aweme.property.b.d());
            bVar2.a("resolution", com.ss.android.ugc.aweme.story.edit.model.a.g(this.$clipModel));
            bVar2.a("music_id", this.$clipModel.getEditMusicModel().getMusicId());
            bVar2.a("privacy_status", com.ss.android.ugc.aweme.photo.a.b.a(0));
            bVar2.a("effect_list", this.$clipModel.getEffectList());
            bVar2.a("info_sticker_list", this.$model.getInfoStickerList());
            EditContext editContext2 = this.$editModel.getEditContext();
            if (editContext2 == null || (etParams2 = editContext2.getEtParams()) == null) {
                str4 = null;
            } else {
                str4 = etParams2.getEnterMethod();
            }
            bVar2.a("shoot_enter_method", str4);
            EditContext editContext3 = this.$editModel.getEditContext();
            if (editContext3 != null) {
                str5 = editContext3.isWestWindowExist();
            } else {
                str5 = null;
            }
            bVar2.a("is_westwindow_exist", str5);
            bVar2.a("last_group_id", dv.f126643b);
            bVar2.a("last_gid_from", dv.f126644c);
            bVar2.a("music_selected_from", this.$clipModel.getEditMusicModel().getMusicOrigin());
            EditContext editContext4 = this.$editModel.getEditContext();
            if (editContext4 != null) {
                str6 = editContext4.getStickers();
            } else {
                str6 = null;
            }
            bVar2.a("prop_list", str6);
            EditContext editContext5 = this.$editModel.getEditContext();
            if (editContext5 != null) {
                str7 = editContext5.getStickers();
            } else {
                str7 = null;
            }
            bVar2.a("prop_id", str7);
            bVar2.a("infosticker_from", this.$model.getInfoStickerFrom());
            StoryEditClipModel storyEditClipModel = this.$clipModel;
            l.d(storyEditClipModel, "");
            if (com.ss.android.ugc.aweme.story.edit.model.a.h(storyEditClipModel) && (infoStickerModel = storyEditClipModel.getInfoStickerModel()) != null && (list = infoStickerModel.stickers) != null && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    l.b(next, "");
                    if (next.isTextSticker()) {
                        i2 = 1;
                        break;
                    }
                }
            }
            i2 = 0;
            bVar2.a("text_added", i2);
            bVar2.a("creation_duration", this.$clipModel.getPreviewMediaInfo().getPreviewVideoLength());
            EditContext editContext6 = this.$editModel.getEditContext();
            if (!(editContext6 == null || (etParams = editContext6.getEtParams()) == null)) {
                obj = Float.valueOf(etParams.getZoom());
            }
            bVar2.a("zoom_value", obj);
            EditContext editContext7 = this.$editModel.getEditContext();
            if (!(editContext7 == null || (stickerInfo = editContext7.getStickerInfo()) == null || stickerInfo.getRecId().length() <= 0)) {
                bVar2.a("prop_rec_id", this.$editModel.getEditContext().getStickerInfo().getRecId());
            }
            InfoStickerModel infoStickerModel2 = this.$clipModel.getInfoStickerModel();
            if (infoStickerModel2 != null) {
                boolean[] a2 = k.a(infoStickerModel2);
                bVar2.a("is_diy_prop", a2[0] ? 1 : 0);
                bVar2.a("remove_background", a2[1] ? 1 : 0);
            }
            if (this.$model.mMusicShowRank > 0) {
                bVar2.a("music_show_rank", this.$model.mMusicShowRank);
            }
            List<TextStickerTextWrap> a3 = com.ss.android.ugc.aweme.sticker.text.d.a(this.$model);
            if (t.h(a3)) {
                bVar2.a("text_added", "1");
            }
            if (t.g(a3)) {
                bVar2.a("anchor_selected_from", "video_edit_page");
                bVar2.a("anchor_type", "wiki");
            }
            if (com.ss.android.ugc.aweme.sticker.text.d.a((BaseShortVideoContext) this.$model)) {
                bVar2.a("anchor_selected_from", "video_post_page");
                bVar2.a("anchor_type", "wiki");
            }
            b.a(bVar2, this.$editModel);
            return z.f158842a;
        }
    }

    public static final void a(com.ss.android.ugc.tools.f.b bVar, StoryEditModel storyEditModel) {
        EditContext editContext = storyEditModel.getEditContext();
        if (editContext != null) {
            long shootTimestamp = editContext.getShootTimestamp();
            if (shootTimestamp > 0) {
                bVar.a("shoot_publish_duration", System.currentTimeMillis() - shootTimestamp);
            }
        }
    }

    public static final void a(String str, StoryEditModel storyEditModel, h.f.a.b<? super com.ss.android.ugc.tools.f.b, z> bVar) {
        l.d(str, "");
        l.d(storyEditModel, "");
        l.d(bVar, "");
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("shoot_page", "story_shoot_page").a("shoot_tab_name", "story").a("creation_id", storyEditModel.getCreationId()).a("shoot_way", storyEditModel.getShootWay()).a("content_type", a(storyEditModel)).a("content_source", b(storyEditModel)).a("is_multi_content", storyEditModel.isMultiContent() ? 1 : 0).a("enter_from", "video_edit_page").a("clips_cnt", storyEditModel.getClips().size()).a("is_story", 1);
        l.b(a2, "");
        bVar.invoke(a2);
        r.a(str, a2.f149193a);
    }

    public static final void a(StoryEditModel storyEditModel, StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(storyEditModel, "");
        l.d(storyEditClipModel, "");
        l.d(videoPublishEditModel, "");
        a("publish", storyEditModel, new f(storyEditClipModel, storyEditModel, i2, videoPublishEditModel));
    }
}
