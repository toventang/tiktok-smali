package com.ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class EditPreviewInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditPreviewInfo> CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    private int calculateHeight;
    private int calculateSourceHeight;
    private int calculateSourceWidth;
    private int calculateWidth;
    private String draftDir;
    private final String initDraftDir;
    private int previewHeight;
    private int previewVideoLength;
    private int previewWidth;
    private String[] reverseAudioArray;
    private String[] reverseVideoArray;
    private long sceneIn;
    private long sceneOut;
    private String[] tempVideoArray;
    private final List<EditVideoSegment> videoList;

    public final int describeContents() {
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Parcelable.Creator<EditPreviewInfo> {
        static {
            Covode.recordClassIndex(83784);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditPreviewInfo[] newArray(int i2) {
            return new EditPreviewInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditPreviewInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EditPreviewInfo(parcel);
        }
    }

    public final int getCalculateHeight() {
        return this.calculateHeight;
    }

    public final int getCalculateSourceHeight() {
        return this.calculateSourceHeight;
    }

    public final int getCalculateSourceWidth() {
        return this.calculateSourceWidth;
    }

    public final int getCalculateWidth() {
        return this.calculateWidth;
    }

    public final String getDraftDir() {
        return this.draftDir;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewVideoLength() {
        return this.previewVideoLength;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final String[] getReverseAudioArray() {
        return this.reverseAudioArray;
    }

    public final String[] getReverseVideoArray() {
        return this.reverseVideoArray;
    }

    public final long getSceneIn() {
        return this.sceneIn;
    }

    public final long getSceneOut() {
        return this.sceneOut;
    }

    public final String[] getTempVideoArray() {
        return this.tempVideoArray;
    }

    public final List<EditVideoSegment> getVideoList() {
        return this.videoList;
    }

    public final String reverseVideo() {
        String[] strArr = this.reverseVideoArray;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    static {
        Covode.recordClassIndex(83782);
    }

    public final int[] getTotalVideoHeight() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getVideoFileInfo().getHeight()));
        }
        return n.e((Collection<Integer>) arrayList);
    }

    public final int[] getTotalVideoWidth() {
        List<EditVideoSegment> list = this.videoList;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getVideoFileInfo().getWidth()));
        }
        return n.e((Collection<Integer>) arrayList);
    }

    public final void setCalculateHeight(int i2) {
        this.calculateHeight = i2;
    }

    public final void setCalculateSourceHeight(int i2) {
        this.calculateSourceHeight = i2;
    }

    public final void setCalculateSourceWidth(int i2) {
        this.calculateSourceWidth = i2;
    }

    public final void setCalculateWidth(int i2) {
        this.calculateWidth = i2;
    }

    public final void setPreviewHeight(int i2) {
        this.previewHeight = i2;
    }

    public final void setPreviewVideoLength(int i2) {
        this.previewVideoLength = i2;
    }

    public final void setPreviewWidth(int i2) {
        this.previewWidth = i2;
    }

    public final void setReverseAudioArray(String[] strArr) {
        this.reverseAudioArray = strArr;
    }

    public final void setReverseVideoArray(String[] strArr) {
        this.reverseVideoArray = strArr;
    }

    public final void setSceneIn(long j2) {
        this.sceneIn = j2;
    }

    public final void setSceneOut(long j2) {
        this.sceneOut = j2;
    }

    public final void setTempVideoArray(String[] strArr) {
        this.tempVideoArray = strArr;
    }

    public final EditPreviewInfo cloneWithNewVideos(List<EditVideoSegment> list) {
        l.d(list, "");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(list, this.previewWidth, this.previewHeight, this.sceneIn, this.sceneOut, this.draftDir);
        editPreviewInfo.calculateWidth = this.calculateWidth;
        editPreviewInfo.calculateHeight = this.calculateHeight;
        editPreviewInfo.previewVideoLength = this.previewVideoLength;
        editPreviewInfo.reverseVideoArray = this.reverseVideoArray;
        editPreviewInfo.reverseAudioArray = this.reverseAudioArray;
        editPreviewInfo.tempVideoArray = this.tempVideoArray;
        return editPreviewInfo;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditPreviewInfo(android.os.Parcel r12) {
        /*
            r11 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r12, r1)
            android.os.Parcelable$Creator<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r0 = com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment.CREATOR
            java.util.ArrayList r3 = r12.createTypedArrayList(r0)
            if (r3 == 0) goto L_0x0052
        L_0x000d:
            int r4 = r12.readInt()
            int r5 = r12.readInt()
            long r6 = r12.readLong()
            long r8 = r12.readLong()
            java.lang.String r10 = ""
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            java.lang.String r0 = r12.readString()
            if (r0 != 0) goto L_0x0050
        L_0x0029:
            r11.draftDir = r1
            int r0 = r12.readInt()
            r11.calculateWidth = r0
            int r0 = r12.readInt()
            r11.calculateHeight = r0
            int r0 = r12.readInt()
            r11.previewVideoLength = r0
            java.lang.String[] r0 = r12.createStringArray()
            r11.reverseVideoArray = r0
            java.lang.String[] r0 = r12.createStringArray()
            r11.reverseAudioArray = r0
            java.lang.String[] r0 = r12.createStringArray()
            r11.tempVideoArray = r0
            return
        L_0x0050:
            r1 = r0
            goto L_0x0029
        L_0x0052:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeTypedList(this.videoList);
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeLong(this.sceneIn);
        parcel.writeLong(this.sceneOut);
        parcel.writeString(this.draftDir);
        parcel.writeInt(this.calculateWidth);
        parcel.writeInt(this.calculateHeight);
        parcel.writeInt(this.previewVideoLength);
        parcel.writeStringArray(this.reverseVideoArray);
        parcel.writeStringArray(this.reverseAudioArray);
        parcel.writeStringArray(this.tempVideoArray);
    }

    public final void updateReverseVideoContent(String[] strArr, String[] strArr2, String[] strArr3) {
        this.reverseVideoArray = strArr;
        this.reverseAudioArray = strArr2;
        this.tempVideoArray = strArr3;
    }

    public EditPreviewInfo(List<EditVideoSegment> list, int i2, int i3, long j2, long j3, String str) {
        l.d(list, "");
        l.d(str, "");
        this.videoList = list;
        this.previewWidth = i2;
        this.previewHeight = i3;
        this.sceneIn = j2;
        this.sceneOut = j3;
        this.initDraftDir = str;
        this.draftDir = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPreviewInfo(List list, int i2, int i3, long j2, long j3, String str, int i4, g gVar) {
        this(list, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, (i4 & 8) != 0 ? -1 : j2, (i4 & 16) != 0 ? -1 : j3, str);
    }
}
