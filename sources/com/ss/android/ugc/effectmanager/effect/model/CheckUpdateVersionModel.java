package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate;
import h.f.b.g;
import java.io.Serializable;

public final class CheckUpdateVersionModel extends CheckUpdateVersionModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel;

    static {
        Covode.recordClassIndex(95395);
    }

    public CheckUpdateVersionModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate
    public final com.ss.ugc.effectplatform.model.CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final String getCursor() {
        String cursor;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (cursor = kUpdateModel2.getCursor()) == null) {
            return super.getCursor();
        }
        return cursor;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final String getSorting_position() {
        String sorting_position;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (sorting_position = kUpdateModel2.getSorting_position()) == null) {
            return super.getSorting_position();
        }
        return sorting_position;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 == null || (version = kUpdateModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final void setCursor(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setCursor(str);
        }
        super.setCursor(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final void setSorting_position(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setSorting_position(str);
        }
        super.setSorting_position(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CheckUpdateVersionModel
    public final void setVersion(String str) {
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            kUpdateModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    public CheckUpdateVersionModel(com.ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel) {
        super(checkUpdateVersionModel);
        this.kUpdateModel = checkUpdateVersionModel;
        com.ss.ugc.effectplatform.model.CheckUpdateVersionModel kUpdateModel2 = getKUpdateModel();
        if (kUpdateModel2 != null) {
            String cursor = kUpdateModel2.getCursor();
            if (cursor != null) {
                super.setCursor(cursor);
            }
            String sorting_position = kUpdateModel2.getSorting_position();
            if (sorting_position != null) {
                super.setSorting_position(sorting_position);
            }
            String version = kUpdateModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModel(com.ss.ugc.effectplatform.model.CheckUpdateVersionModel checkUpdateVersionModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
