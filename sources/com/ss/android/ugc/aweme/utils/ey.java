package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ey {
    static {
        Covode.recordClassIndex(93504);
    }

    public static final class a extends m implements b<FrameItem, Boolean> {
        final /* synthetic */ p $startEndTime;

        static {
            Covode.recordClassIndex(93505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(1);
            this.$startEndTime = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(FrameItem frameItem) {
            boolean z;
            FrameItem frameItem2 = frameItem;
            l.d(frameItem2, "");
            p pVar = this.$startEndTime;
            long timeStamp = frameItem2.getTimeStamp() / 1000;
            if (timeStamp < ((Number) pVar.getFirst()).longValue() || timeStamp > ((Number) pVar.getSecond()).longValue()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(true ^ z);
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.getFramesV1() != null && videoPublishEditModel.extractFramesModel.getSegmentFrameKeys() != null) {
            ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
            Iterator<Map.Entry<Integer, String>> it = extractFramesModel.getSegmentFrameKeys().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, String> next = it.next();
                if (!a(next.getValue(), videoPublishEditModel)) {
                    HashMap<Integer, ArrayList<FrameItem>> framesV1 = extractFramesModel.getFramesV1();
                    if (framesV1 != null) {
                        framesV1.remove(next.getKey());
                    }
                    HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                    if (multiStickers != null) {
                        multiStickers.remove(next.getKey());
                    }
                    it.remove();
                }
            }
        }
    }

    public static final p<Long, Long> a(VideoPublishEditModel videoPublishEditModel, String str) {
        l.d(videoPublishEditModel, "");
        l.d(str, "");
        if (videoPublishEditModel.getCurMultiEditVideoRecordData().isSingleVideo) {
            TimeSpeedModelExtension timeSpeedModelExtension = videoPublishEditModel.getFinalVideoList().get(0);
            l.b(timeSpeedModelExtension, "");
            if (l.a((Object) str, (Object) timeSpeedModelExtension.getIdentityKey())) {
                return new p<>(Long.valueOf(videoPublishEditModel.getCurMultiEditVideoRecordData().startTime), Long.valueOf(videoPublishEditModel.getCurMultiEditVideoRecordData().endTime));
            }
            return null;
        }
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        l.b(curMultiEditVideoRecordData, "");
        List<MultiEditVideoSegmentRecordData> d2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.d(curMultiEditVideoRecordData);
        if (videoPublishEditModel.getFinalVideoList().size() != d2.size()) {
            return null;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        l.b(finalVideoList, "");
        int size = finalVideoList.size();
        for (int i2 = 0; i2 < size; i2++) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = d2.get(i2);
            TimeSpeedModelExtension timeSpeedModelExtension2 = videoPublishEditModel.getFinalVideoList().get(i2);
            l.b(timeSpeedModelExtension2, "");
            if (l.a((Object) str, (Object) timeSpeedModelExtension2.getIdentityKey())) {
                return new p<>(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
            }
        }
        return null;
    }

    public static final boolean a(String str, VideoPublishEditModel videoPublishEditModel) {
        T t;
        String stickerId;
        l.d(videoPublishEditModel, "");
        if (str == null) {
            return true;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        l.b(finalVideoList, "");
        Iterator<T> it = finalVideoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String identityKey = t.getIdentityKey();
            if (identityKey != null && l.a((Object) identityKey, (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return false;
        }
        if (videoPublishEditModel.hasUploadFrameConditionInEdit() || ((stickerId = t2.getStickerId()) != null && stickerId.length() != 0)) {
            return true;
        }
        return false;
    }
}
