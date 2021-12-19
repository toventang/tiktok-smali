package com.ss.android.ml.process.bl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.c;
import java.util.List;

public class PreOPModel implements c {
    public List<String> args;
    public String feature;
    public List<String> lables;
    public int length;
    public String op;
    public List<Float> opts;
    public String type;
    public int vector_length;
    public int vector_num;

    static {
        Covode.recordClassIndex(37028);
    }

    @Override // com.ss.android.ml.process.b
    public List<String> getArgs() {
        return this.args;
    }

    @Override // com.ss.android.ml.process.c
    public String getFeature() {
        return this.feature;
    }

    @Override // com.ss.android.ml.process.c
    public List<String> getLabels() {
        return this.lables;
    }

    @Override // com.ss.android.ml.process.b
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // com.ss.android.ml.process.b
    public String getOperator() {
        return this.op;
    }

    @Override // com.ss.android.ml.process.c
    public String getType() {
        return this.type;
    }

    @Override // com.ss.android.ml.process.c
    public int getVectorLength() {
        return this.vector_length;
    }

    @Override // com.ss.android.ml.process.c
    public int getVectorNum() {
        return this.vector_num;
    }

    @Override // com.ss.android.ml.process.c
    public int getLength() {
        if (getVectorLength() <= 0 || getVectorNum() <= 0) {
            return this.length;
        }
        return getVectorLength() * getVectorNum();
    }

    public String toString() {
        return "PreOPModel{feature='" + this.feature + '\'' + ", op='" + this.op + '\'' + ", args=" + this.args + ", opts=" + this.opts + ", lables=" + this.lables + ", length=" + this.length + ", type='" + this.type + '\'' + ", vector_length=" + this.vector_length + ", vector_num=" + this.vector_num + '}';
    }
}
