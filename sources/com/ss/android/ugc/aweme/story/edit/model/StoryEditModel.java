package com.ss.android.ugc.aweme.story.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.story.edit.clip.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class StoryEditModel implements Parcelable, c<StoryEditClipModel>, Serializable {
    public static final a CREATOR = new a((byte) 0);
    private ArrayList<StoryEditClipModel> _clips;
    private final String creationId;
    private final EditContext editContext;
    private final boolean isMultiContent;
    private final int origin;
    private final String shootWay;

    static {
        Covode.recordClassIndex(90011);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<StoryEditModel> {
        static {
            Covode.recordClassIndex(90012);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditModel[] newArray(int i2) {
            return new StoryEditModel[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StoryEditModel(parcel);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.clip.a.c
    public final List<StoryEditClipModel> getClips() {
        return this._clips;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final EditContext getEditContext() {
        return this.editContext;
    }

    public final int getOrigin() {
        return this.origin;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean isMultiContent() {
        return this.isMultiContent;
    }

    public final void clear() {
        this._clips.clear();
    }

    public final boolean remove(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        return this._clips.remove(storyEditClipModel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryEditModel(android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r8, r0)
            java.lang.String r2 = r8.readString()
            if (r2 != 0) goto L_0x000e
            h.f.b.l.b()
        L_0x000e:
            h.f.b.l.b(r2, r0)
            java.lang.String r3 = r8.readString()
            if (r3 != 0) goto L_0x001a
            h.f.b.l.b()
        L_0x001a:
            h.f.b.l.b(r3, r0)
            int r4 = r8.readInt()
            byte r1 = r8.readByte()
            r0 = 1
            if (r1 != r0) goto L_0x004b
            r5 = 1
        L_0x0029:
            java.lang.Class<com.ss.android.ugc.aweme.story.base.model.EditContext> r0 = com.ss.android.ugc.aweme.story.base.model.EditContext.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r6 = r8.readParcelable(r0)
            com.ss.android.ugc.aweme.story.base.model.EditContext r6 = (com.ss.android.ugc.aweme.story.base.model.EditContext) r6
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Class<com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel> r0 = com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r1 = r8.readArrayList(r0)
        */
        //  java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel> /* = java.util.ArrayList<com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel> */"
        /*
            java.util.Objects.requireNonNull(r1, r0)
            r7._clips = r1
            return
        L_0x004b:
            r0 = 0
            r5 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.edit.model.StoryEditModel.<init>(android.os.Parcel):void");
    }

    public final void add(StoryEditClipModel storyEditClipModel, int i2) {
        boolean z;
        l.d(storyEditClipModel, "");
        storyEditClipModel.setCreationId(this.creationId);
        if (this.origin == 0) {
            z = true;
        } else {
            z = false;
        }
        storyEditClipModel.setFastImport(z);
        if (i2 < 0 || i2 > this._clips.size()) {
            this._clips.add(storyEditClipModel);
        } else {
            this._clips.add(i2, storyEditClipModel);
        }
    }

    public final void swap(StoryEditClipModel storyEditClipModel, StoryEditClipModel storyEditClipModel2) {
        l.d(storyEditClipModel, "");
        l.d(storyEditClipModel2, "");
        ArrayList<StoryEditClipModel> arrayList = this._clips;
        int indexOf = arrayList.indexOf(storyEditClipModel);
        int indexOf2 = this._clips.indexOf(storyEditClipModel2);
        l.d(arrayList, "");
        if (indexOf != indexOf2 && indexOf >= 0 && indexOf2 >= 0 && indexOf <= arrayList.size() - 1 && indexOf2 <= arrayList.size() - 1) {
            StoryEditClipModel storyEditClipModel3 = arrayList.get(indexOf);
            arrayList.set(indexOf, arrayList.get(indexOf2));
            arrayList.set(indexOf2, storyEditClipModel3);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.creationId);
        parcel.writeString(this.shootWay);
        parcel.writeInt(this.origin);
        parcel.writeByte(this.isMultiContent ? (byte) 1 : 0);
        parcel.writeParcelable(this.editContext, i2);
        parcel.writeList(getClips());
    }

    public StoryEditModel(String str, String str2, int i2, boolean z, EditContext editContext2) {
        l.d(str, "");
        l.d(str2, "");
        this.creationId = str;
        this.shootWay = str2;
        this.origin = i2;
        this.isMultiContent = z;
        this.editContext = editContext2;
        this._clips = new ArrayList<>();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditModel(String str, String str2, int i2, boolean z, EditContext editContext2, int i3, g gVar) {
        this(str, str2, i2, z, (i3 & 16) != 0 ? null : editContext2);
    }
}
