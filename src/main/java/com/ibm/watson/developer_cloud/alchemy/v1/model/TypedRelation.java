/*
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ibm.watson.developer_cloud.alchemy.v1.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;

import java.util.List;

/**
 * Typed relation between {@link TypedEntity}.
 * @see AlchemyLanguage#getTypedRelations(java.util.Map)
 */
public class TypedRelation {

    private String text;
    private String type;
    private Double score;

    @JsonAdapter(TypedEntitiesAdapter.class)
    @SerializedName("arguments")
    private List<TypedEntity> entities;

    /**
     * Gets the text.
     *
     * @return     The text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text.
     *
     * @param text     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets the type.
     *
     * @return     The type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the score.
     *
     * @return     The score
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the score.
     *
     * @param score     The score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * @return the entities
     */
    public List<TypedEntity> getEntities() {
        return entities;
    }

    /**
     * @param entities the entities to set
     */
    public void setEntities(List<TypedEntity> entities) {
        this.entities = entities;
    }

}
