package com.ss.ugc.effectplatform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.c;
import com.ss.ugc.effectplatform.d;
import com.ss.ugc.effectplatform.f;
import h.f.b.l;
import h.m.p;
import h.w;
import java.util.ArrayList;
import java.util.List;

public class Effect implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    private String _model_names;
    private List<String> _requirements;
    private List<String> _type;
    private String ad_raw_data;
    private List<String> bind_ids;
    private List<String> challenge;
    private List<? extends Effect> child_effects;
    private List<String> children;
    private List<String> composerPath;
    private String composer_params;
    private String designer_encrypted_id;
    private String designer_id;
    private String device_platform;
    private String effect_id;
    private int effect_type;
    private String extra;
    private UrlModel file_url;
    private String grade_key;
    private String hint;
    private UrlModel hint_file;
    private int hint_file_format;
    private UrlModel hint_icon;
    private UrlModel icon_url;
    private String id;
    private String iop_id;
    private boolean isDownloaded;
    private boolean is_busi;
    private boolean is_iop;
    private String model_names;
    private String model_names_sec;
    private List<String> music;
    private String name;
    private String original_effect_id;
    private String panel;
    private String parent;
    private String platformVersion;
    private long ptime;
    private String recId;
    private List<String> requirements;
    private List<String> requirements_sec;
    private String resource_id;
    private String schema;
    private String sdk_extra;
    private String searchType;
    private int source;
    private List<String> tags;
    private String tags_updated_at;
    private String transResPath;
    private UrlModel trans_file_url;
    private List<String> types;
    private List<String> types_sec;
    private String unzipPath;
    private long use_number;
    private String zipPath;

    static {
        Covode.recordClassIndex(102446);
    }

    public Effect() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
    }

    public int describeContents() {
        return 0;
    }

    static final class a extends a {
        static {
            Covode.recordClassIndex(102447);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public String getAd_raw_data() {
        return this.ad_raw_data;
    }

    public List<String> getBind_ids() {
        return this.bind_ids;
    }

    public List<String> getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getChild_effects() {
        return this.child_effects;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public List<String> getComposerPath() {
        return this.composerPath;
    }

    public String getComposer_params() {
        return this.composer_params;
    }

    public String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public String getDesigner_id() {
        return this.designer_id;
    }

    public String getDevice_platform() {
        return this.device_platform;
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public int getEffect_type() {
        return this.effect_type;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getFile_url() {
        return this.file_url;
    }

    public String getGrade_key() {
        return this.grade_key;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHint_file() {
        return this.hint_file;
    }

    public int getHint_file_format() {
        return this.hint_file_format;
    }

    public UrlModel getHint_icon() {
        return this.hint_icon;
    }

    public UrlModel getIcon_url() {
        return this.icon_url;
    }

    public String getId() {
        return this.id;
    }

    public final String getInternalModelNames$effect_model_release() {
        return this._model_names;
    }

    public final List<String> getInternalRequirements$effect_model_release() {
        return this._requirements;
    }

    public final List<String> getInternalType$effect_model_release() {
        return this._type;
    }

    public String getIop_id() {
        return this.iop_id;
    }

    public String getModel_names_sec() {
        return this.model_names_sec;
    }

    public List<String> getMusic() {
        return this.music;
    }

    public String getName() {
        return this.name;
    }

    public String getOriginal_effect_id() {
        return this.original_effect_id;
    }

    public String getPanel() {
        return this.panel;
    }

    public String getParent() {
        return this.parent;
    }

    public final String getPlatformVersion() {
        return this.platformVersion;
    }

    public long getPtime() {
        return this.ptime;
    }

    public String getRecId() {
        return this.recId;
    }

    public final List<String> getRequirements_sec() {
        return this.requirements_sec;
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdk_extra() {
        return this.sdk_extra;
    }

    public String getSearchType() {
        return this.searchType;
    }

    public int getSource() {
        return this.source;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getTransResPath() {
        return this.transResPath;
    }

    public UrlModel getTrans_file_url() {
        return this.trans_file_url;
    }

    public final List<String> getTypes_sec() {
        return this.types_sec;
    }

    public String getUnzipPath() {
        return this.unzipPath;
    }

    public long getUse_number() {
        return this.use_number;
    }

    public String getZipPath() {
        return this.zipPath;
    }

    public boolean isDownloaded() {
        return this.isDownloaded;
    }

    public boolean is_busi() {
        return this.is_busi;
    }

    public boolean is_iop() {
        return this.is_iop;
    }

    public static class b implements Parcelable.Creator {
        static {
            Covode.recordClassIndex(102448);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i2) {
            return new Effect[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            String str = "";
            l.c(parcel, str);
            l.c(parcel, str);
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Parcelable readParcelable = parcel.readParcelable(Effect.class.getClassLoader());
            if (readParcelable != null) {
                UrlModel urlModel = (UrlModel) readParcelable;
                Parcelable readParcelable2 = parcel.readParcelable(Effect.class.getClassLoader());
                if (readParcelable2 != null) {
                    UrlModel urlModel2 = (UrlModel) readParcelable2;
                    Parcelable readParcelable3 = parcel.readParcelable(Effect.class.getClassLoader());
                    if (readParcelable3 != null) {
                        UrlModel urlModel3 = (UrlModel) readParcelable3;
                        Parcelable readParcelable4 = parcel.readParcelable(Effect.class.getClassLoader());
                        if (readParcelable4 != null) {
                            UrlModel urlModel4 = (UrlModel) readParcelable4;
                            int readInt = parcel.readInt();
                            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                            String readString5 = parcel.readString();
                            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                            int readInt2 = parcel.readInt();
                            ArrayList arrayList = new ArrayList(readInt2);
                            while (readInt2 != 0) {
                                Parcelable readParcelable5 = parcel.readParcelable(Effect.class.getClassLoader());
                                if (readParcelable5 != null) {
                                    arrayList.add(readParcelable5);
                                    readInt2--;
                                } else {
                                    throw new w("null cannot be cast to non-null type");
                                }
                            }
                            if (readString == null) {
                                readString = str;
                            }
                            if (createStringArrayList == null) {
                                createStringArrayList = new ArrayList<>();
                            }
                            if (readString2 == null) {
                                readString2 = str;
                            }
                            if (readString3 == null) {
                                readString3 = str;
                            }
                            if (readString4 == null) {
                                readString4 = str;
                            }
                            if (createStringArrayList3 == null) {
                                createStringArrayList3 = new ArrayList<>();
                            }
                            if (readString5 == null) {
                                readString5 = str;
                            }
                            String readString6 = parcel.readString();
                            int readInt3 = parcel.readInt();
                            int readInt4 = parcel.readInt();
                            String readString7 = parcel.readString();
                            if (readString7 == null) {
                                readString7 = str;
                            }
                            String readString8 = parcel.readString();
                            if (readString8 == null) {
                                readString8 = str;
                            }
                            String readString9 = parcel.readString();
                            if (readString9 == null) {
                                readString9 = str;
                            }
                            String readString10 = parcel.readString();
                            if (readString10 == null) {
                                readString10 = str;
                            }
                            ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
                            String readString11 = parcel.readString();
                            String readString12 = parcel.readString();
                            if (readString12 == null) {
                                readString12 = str;
                            }
                            String readString13 = parcel.readString();
                            if (readString13 == null) {
                                readString13 = str;
                            }
                            String readString14 = parcel.readString();
                            if (readString14 == null) {
                                readString14 = str;
                            }
                            boolean z = parcel.readInt() == 1;
                            String readString15 = parcel.readString();
                            if (readString15 == null) {
                                readString15 = str;
                            }
                            boolean z2 = parcel.readInt() == 1;
                            String readString16 = parcel.readString();
                            if (readString16 == null) {
                                readString16 = str;
                            }
                            ArrayList<String> createStringArrayList8 = parcel.createStringArrayList();
                            long readLong = parcel.readLong();
                            String readString17 = parcel.readString();
                            if (readString17 == null) {
                                readString17 = str;
                            }
                            ArrayList<String> createStringArrayList9 = parcel.createStringArrayList();
                            long readLong2 = parcel.readLong();
                            ArrayList<String> createStringArrayList10 = parcel.createStringArrayList();
                            String readString18 = parcel.readString();
                            if (readString18 == null) {
                                readString18 = str;
                            }
                            String readString19 = parcel.readString();
                            if (readString19 == null) {
                                readString19 = str;
                            }
                            String readString20 = parcel.readString();
                            if (readString20 == null) {
                                readString20 = str;
                            }
                            boolean z3 = parcel.readInt() == 1;
                            String readString21 = parcel.readString();
                            if (readString21 == null) {
                                readString21 = str;
                            }
                            String readString22 = parcel.readString();
                            if (readString22 == null) {
                                readString22 = str;
                            }
                            String readString23 = parcel.readString();
                            if (readString23 != null) {
                                str = readString23;
                            }
                            String readString24 = parcel.readString();
                            String readString25 = parcel.readString();
                            String readString26 = parcel.readString();
                            String readString27 = parcel.readString();
                            Parcelable readParcelable6 = parcel.readParcelable(UrlModel.class.getClassLoader());
                            if (!(readParcelable6 instanceof UrlModel)) {
                                readParcelable6 = null;
                            }
                            Effect effect = new Effect(readString, createStringArrayList, createStringArrayList2, readString2, readString3, readString4, urlModel, urlModel2, urlModel3, urlModel4, readInt, createStringArrayList3, createStringArrayList4, createStringArrayList5, readString5, createStringArrayList6, arrayList, readString6, readInt3, readInt4, readString7, readString8, readString9, readString10, createStringArrayList7, readString11, readString12, readString13, readString14, z, readString15, z2, readString16, createStringArrayList8, readLong, readString17, createStringArrayList9, readLong2, createStringArrayList10, readString18, readString19, readString20, z3, readString21, readString22, str, readString24, readString25, readString26, readString27, (UrlModel) readParcelable6);
                            ArrayList<String> createStringArrayList11 = parcel.createStringArrayList();
                            if (createStringArrayList11 == null) {
                                createStringArrayList11 = new ArrayList<>();
                            }
                            effect.setRequirements(createStringArrayList11);
                            ArrayList<String> createStringArrayList12 = parcel.createStringArrayList();
                            if (createStringArrayList12 == null) {
                                createStringArrayList12 = new ArrayList<>();
                            }
                            effect.setTypes(createStringArrayList12);
                            effect.setModel_names(parcel.readString());
                            return effect;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public int hashCode() {
        return (((getId().hashCode() * 31) + getEffect_id().hashCode()) * 31) + getResource_id().hashCode();
    }

    public final String getModel_names() {
        String model_names_sec2;
        String decrypt;
        String str = this._model_names;
        if ((str == null || p.a((CharSequence) str)) && (model_names_sec2 = getModel_names_sec()) != null && !p.a((CharSequence) model_names_sec2)) {
            String str2 = null;
            if (!com.ss.ugc.effectplatform.d.a.f153565a) {
                f fVar = c.f153561a;
                if (fVar != null) {
                    str2 = fVar.decrypt(getModel_names_sec());
                }
            } else {
                f fVar2 = c.f153561a;
                if (fVar2 == null || (decrypt = fVar2.decrypt(getModel_names_sec(), this.platformVersion)) == null || p.a((CharSequence) decrypt)) {
                    f fVar3 = c.f153561a;
                    if (fVar3 != null) {
                        str2 = fVar3.decrypt(getModel_names_sec());
                    }
                } else {
                    str2 = decrypt;
                }
            }
            this._model_names = str2;
        }
        String str3 = this._model_names;
        if (str3 == null || p.a((CharSequence) str3)) {
            return this.model_names;
        }
        return this._model_names;
    }

    public List<String> getRequirements() {
        List<String> list;
        List<String> arrayList;
        List<String> list2 = this.requirements_sec;
        if (list2 != null && !list2.isEmpty() && ((list = this.requirements_sec) == null || list.size() != this._requirements.size())) {
            if (!com.ss.ugc.effectplatform.d.a.f153565a) {
                f fVar = c.f153561a;
                if (fVar == null || (arrayList = d.a(fVar, this.requirements_sec)) == null) {
                    arrayList = new ArrayList<>();
                }
            } else {
                f fVar2 = c.f153561a;
                if (fVar2 == null || (arrayList = d.a(fVar2, this.requirements_sec, this.platformVersion)) == null) {
                    arrayList = new ArrayList<>();
                }
            }
            this._requirements = arrayList;
        }
        if (this._requirements.isEmpty()) {
            return this.requirements;
        }
        return this._requirements;
    }

    public List<String> getTypes() {
        List<String> list;
        List<String> arrayList;
        List<String> list2 = this.types_sec;
        if (list2 != null && !list2.isEmpty() && ((list = this.types_sec) == null || list.size() != this._type.size())) {
            if (!com.ss.ugc.effectplatform.d.a.f153565a) {
                f fVar = c.f153561a;
                if (fVar == null || (arrayList = d.a(fVar, this.types_sec)) == null) {
                    arrayList = new ArrayList<>();
                }
            } else {
                f fVar2 = c.f153561a;
                if (fVar2 == null || (arrayList = d.a(fVar2, this.types_sec, this.platformVersion)) == null) {
                    arrayList = new ArrayList<>();
                }
            }
            this._type = arrayList;
        }
        if (this._type.isEmpty()) {
            return this.types;
        }
        return this._type;
    }

    public String toString() {
        return "Effect(name='" + getName() + "', _requirements=" + this._requirements + ", requirements_sec=" + this.requirements_sec + ", hint='" + getHint() + "', id='" + getId() + "', effect_id='" + getEffect_id() + "', file_url=" + getFile_url() + ", icon_url=" + getIcon_url() + ", hint_icon=" + getHint_icon() + ", hint_file=" + getHint_file() + ", hint_file_format=" + getHint_file_format() + ", _type=" + this._type + ", types_sec=" + this.types_sec + ", tags=" + getTags() + ", tags_updated_at='" + getTags_updated_at() + "', children=" + getChildren() + ", child_effects=" + getChild_effects() + ", parent=" + getParent() + ", effect_type=" + getEffect_type() + ", source=" + getSource() + ", designer_id='" + getDesigner_id() + "', designer_encrypted_id='" + getDesigner_encrypted_id() + "', device_platform='" + getDevice_platform() + "', schema='" + getSchema() + "', music=" + getMusic() + ", extra=" + getExtra() + ", sdk_extra='" + getSdk_extra() + "', ad_raw_data='" + getAd_raw_data() + "', composer_params='" + getComposer_params() + "', is_busi=" + is_busi() + ", iop_id='" + getIop_id() + "', is_iop=" + is_iop() + ", resource_id='" + getResource_id() + "', bind_ids=" + getBind_ids() + ", ptime=" + getPtime() + ", grade_key='" + getGrade_key() + "', challenge=" + getChallenge() + ", composerPath=" + getComposerPath() + ", zipPath='" + getZipPath() + "', unzipPath='" + getUnzipPath() + "', transResPath='" + getTransResPath() + "', isDownloaded=" + isDownloaded() + ", panel='" + getPanel() + "', searchType='" + getSearchType() + "', recId=" + getRecId() + ", _model_names=" + this._model_names + ", model_names_sec=" + getModel_names_sec() + ", original_effect_id=" + getOriginal_effect_id() + ", trans_file_url=" + getTrans_file_url() + ", requirements=" + getRequirements() + ", types=" + getTypes() + ", model_names=" + getModel_names() + ')';
    }

    public void setBind_ids(List<String> list) {
        this.bind_ids = list;
    }

    public void setChallenge(List<String> list) {
        this.challenge = list;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setComposerPath(List<String> list) {
        this.composerPath = list;
    }

    public void setDownloaded(boolean z) {
        this.isDownloaded = z;
    }

    public void setEffect_type(int i2) {
        this.effect_type = i2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHint_file_format(int i2) {
        this.hint_file_format = i2;
    }

    public final void setModel_names(String str) {
        this.model_names = str;
    }

    public void setModel_names_sec(String str) {
        this.model_names_sec = str;
    }

    public void setMusic(List<String> list) {
        this.music = list;
    }

    public void setOriginal_effect_id(String str) {
        this.original_effect_id = str;
    }

    public void setParent(String str) {
        this.parent = str;
    }

    public void setPtime(long j2) {
        this.ptime = j2;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public final void setRequirements_sec(List<String> list) {
        this.requirements_sec = list;
    }

    public void setSource(int i2) {
        this.source = i2;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTrans_file_url(UrlModel urlModel) {
        this.trans_file_url = urlModel;
    }

    public final void setTypes_sec(List<String> list) {
        this.types_sec = list;
    }

    public void setUse_number(long j2) {
        this.use_number = j2;
    }

    public void set_busi(boolean z) {
        this.is_busi = z;
    }

    public void set_iop(boolean z) {
        this.is_iop = z;
    }

    public void setAd_raw_data(String str) {
        l.c(str, "");
        this.ad_raw_data = str;
    }

    public void setChild_effects(List<? extends Effect> list) {
        l.c(list, "");
        this.child_effects = list;
    }

    public void setComposer_params(String str) {
        l.c(str, "");
        this.composer_params = str;
    }

    public void setDesigner_encrypted_id(String str) {
        l.c(str, "");
        this.designer_encrypted_id = str;
    }

    public void setDesigner_id(String str) {
        l.c(str, "");
        this.designer_id = str;
    }

    public void setDevice_platform(String str) {
        l.c(str, "");
        this.device_platform = str;
    }

    public void setEffect_id(String str) {
        l.c(str, "");
        this.effect_id = str;
    }

    public void setFile_url(UrlModel urlModel) {
        l.c(urlModel, "");
        this.file_url = urlModel;
    }

    public void setGrade_key(String str) {
        l.c(str, "");
        this.grade_key = str;
    }

    public void setHint(String str) {
        l.c(str, "");
        this.hint = str;
    }

    public void setHint_file(UrlModel urlModel) {
        l.c(urlModel, "");
        this.hint_file = urlModel;
    }

    public void setHint_icon(UrlModel urlModel) {
        l.c(urlModel, "");
        this.hint_icon = urlModel;
    }

    public void setIcon_url(UrlModel urlModel) {
        l.c(urlModel, "");
        this.icon_url = urlModel;
    }

    public void setId(String str) {
        l.c(str, "");
        this.id = str;
    }

    public void setIop_id(String str) {
        l.c(str, "");
        this.iop_id = str;
    }

    public void setName(String str) {
        l.c(str, "");
        this.name = str;
    }

    public void setPanel(String str) {
        l.c(str, "");
        this.panel = str;
    }

    public final void setPlatformVersion(String str) {
        l.c(str, "");
        this.platformVersion = str;
    }

    public void setRequirements(List<String> list) {
        l.c(list, "");
        this.requirements = list;
    }

    public void setResource_id(String str) {
        l.c(str, "");
        this.resource_id = str;
    }

    public void setSchema(String str) {
        l.c(str, "");
        this.schema = str;
    }

    public void setSdk_extra(String str) {
        l.c(str, "");
        this.sdk_extra = str;
    }

    public void setSearchType(String str) {
        l.c(str, "");
        this.searchType = str;
    }

    public void setTags_updated_at(String str) {
        l.c(str, "");
        this.tags_updated_at = str;
    }

    public void setTransResPath(String str) {
        l.c(str, "");
        this.transResPath = str;
    }

    public void setTypes(List<String> list) {
        l.c(list, "");
        this.types = list;
    }

    public void setUnzipPath(String str) {
        l.c(str, "");
        this.unzipPath = str;
    }

    public void setZipPath(String str) {
        l.c(str, "");
        this.zipPath = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effect)) {
            return false;
        }
        Effect effect = (Effect) obj;
        if (!(!l.a((Object) getId(), (Object) effect.getId())) && !(!l.a((Object) getEffect_id(), (Object) effect.getEffect_id())) && !(!l.a((Object) getResource_id(), (Object) effect.getResource_id()))) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        l.c(this, "");
        l.c(parcel, "");
        parcel.writeString(getName());
        parcel.writeStringList(getInternalRequirements$effect_model_release());
        parcel.writeStringList(getRequirements_sec());
        parcel.writeString(getHint());
        parcel.writeString(getId());
        parcel.writeString(getEffect_id());
        parcel.writeParcelable(getFile_url(), i2);
        parcel.writeParcelable(getIcon_url(), i2);
        parcel.writeParcelable(getHint_icon(), i2);
        parcel.writeParcelable(getHint_file(), i2);
        parcel.writeInt(getHint_file_format());
        parcel.writeStringList(getInternalType$effect_model_release());
        parcel.writeStringList(getTypes_sec());
        parcel.writeStringList(getTags());
        parcel.writeString(getTags_updated_at());
        parcel.writeStringList(getChildren());
        List<Effect> child_effects2 = getChild_effects();
        parcel.writeInt(child_effects2.size());
        for (Effect effect : child_effects2) {
            parcel.writeParcelable(effect, i2);
        }
        parcel.writeString(getParent());
        parcel.writeInt(getEffect_type());
        parcel.writeInt(getSource());
        parcel.writeString(getDesigner_id());
        parcel.writeString(getDesigner_encrypted_id());
        parcel.writeString(getDevice_platform());
        parcel.writeString(getSchema());
        parcel.writeStringList(getMusic());
        parcel.writeString(getExtra());
        parcel.writeString(getSdk_extra());
        parcel.writeString(getAd_raw_data());
        parcel.writeString(getComposer_params());
        parcel.writeInt(is_busi() ? 1 : 0);
        parcel.writeString(getIop_id());
        parcel.writeInt(is_iop() ? 1 : 0);
        parcel.writeString(getResource_id());
        parcel.writeStringList(getBind_ids());
        parcel.writeLong(getPtime());
        parcel.writeString(getGrade_key());
        parcel.writeStringList(getChallenge());
        parcel.writeLong(getUse_number());
        parcel.writeStringList(getComposerPath());
        parcel.writeString(getZipPath());
        parcel.writeString(getUnzipPath());
        parcel.writeString(getTransResPath());
        parcel.writeInt(isDownloaded() ? 1 : 0);
        parcel.writeString(getPanel());
        parcel.writeString(getSearchType());
        parcel.writeString(getPlatformVersion());
        parcel.writeString(getRecId());
        parcel.writeString(getInternalModelNames$effect_model_release());
        parcel.writeString(getModel_names_sec());
        parcel.writeString(getOriginal_effect_id());
        parcel.writeParcelable(getTrans_file_url(), i2);
        parcel.writeStringList(getRequirements());
        parcel.writeStringList(getTypes());
        parcel.writeString(getModel_names());
    }

    public Effect(String str, List<String> list, List<String> list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i2, List<String> list3, List<String> list4, List<String> list5, String str5, List<String> list6, List<? extends Effect> list7, String str6, int i3, int i4, String str7, String str8, String str9, String str10, List<String> list8, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, String str16, List<String> list9, long j2, String str17, List<String> list10, long j3, List<String> list11, String str18, String str19, String str20, boolean z3, String str21, String str22, String str23, String str24, String str25, String str26, String str27, UrlModel urlModel5) {
        l.c(str, "");
        l.c(list, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(str4, "");
        l.c(urlModel, "");
        l.c(urlModel2, "");
        l.c(urlModel3, "");
        l.c(urlModel4, "");
        l.c(list3, "");
        l.c(str5, "");
        l.c(list7, "");
        l.c(str7, "");
        l.c(str8, "");
        l.c(str9, "");
        l.c(str10, "");
        l.c(str12, "");
        l.c(str13, "");
        l.c(str14, "");
        l.c(str15, "");
        l.c(str16, "");
        l.c(str17, "");
        l.c(str18, "");
        l.c(str19, "");
        l.c(str20, "");
        l.c(str21, "");
        l.c(str22, "");
        l.c(str23, "");
        this.name = str;
        this._requirements = list;
        this.requirements_sec = list2;
        this.hint = str2;
        this.id = str3;
        this.effect_id = str4;
        this.file_url = urlModel;
        this.icon_url = urlModel2;
        this.hint_icon = urlModel3;
        this.hint_file = urlModel4;
        this.hint_file_format = i2;
        this._type = list3;
        this.types_sec = list4;
        this.tags = list5;
        this.tags_updated_at = str5;
        this.children = list6;
        this.child_effects = list7;
        this.parent = str6;
        this.effect_type = i3;
        this.source = i4;
        this.designer_id = str7;
        this.designer_encrypted_id = str8;
        this.device_platform = str9;
        this.schema = str10;
        this.music = list8;
        this.extra = str11;
        this.sdk_extra = str12;
        this.ad_raw_data = str13;
        this.composer_params = str14;
        this.is_busi = z;
        this.iop_id = str15;
        this.is_iop = z2;
        this.resource_id = str16;
        this.bind_ids = list9;
        this.ptime = j2;
        this.grade_key = str17;
        this.challenge = list10;
        this.use_number = j3;
        this.composerPath = list11;
        this.zipPath = str18;
        this.unzipPath = str19;
        this.transResPath = str20;
        this.isDownloaded = z3;
        this.panel = str21;
        this.searchType = str22;
        this.platformVersion = str23;
        this.recId = str24;
        this._model_names = str25;
        this.model_names_sec = str26;
        this.original_effect_id = str27;
        this.trans_file_url = urlModel5;
        this.requirements = new ArrayList();
        this.types = new ArrayList();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Effect(java.lang.String r60, java.util.List r61, java.util.List r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, com.ss.ugc.effectplatform.model.UrlModel r66, com.ss.ugc.effectplatform.model.UrlModel r67, com.ss.ugc.effectplatform.model.UrlModel r68, com.ss.ugc.effectplatform.model.UrlModel r69, int r70, java.util.List r71, java.util.List r72, java.util.List r73, java.lang.String r74, java.util.List r75, java.util.List r76, java.lang.String r77, int r78, int r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.util.List r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, boolean r89, java.lang.String r90, boolean r91, java.lang.String r92, java.util.List r93, long r94, java.lang.String r96, java.util.List r97, long r98, java.util.List r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, boolean r104, java.lang.String r105, java.lang.String r106, java.lang.String r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, java.lang.String r111, com.ss.ugc.effectplatform.model.UrlModel r112, int r113, int r114, h.f.b.g r115) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.Effect.<init>(java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, com.ss.ugc.effectplatform.model.UrlModel, int, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.util.List, long, java.lang.String, java.util.List, long, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.UrlModel, int, int, h.f.b.g):void");
    }
}
