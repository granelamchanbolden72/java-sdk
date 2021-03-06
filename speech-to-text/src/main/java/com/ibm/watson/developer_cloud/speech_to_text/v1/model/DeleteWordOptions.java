/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.speech_to_text.v1.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;
import com.ibm.watson.developer_cloud.util.Validator;

/**
 * The deleteWord options.
 */
public class DeleteWordOptions extends GenericModel {

  private String customizationId;
  private String wordName;

  /**
   * Builder.
   */
  public static class Builder {
    private String customizationId;
    private String wordName;

    private Builder(DeleteWordOptions deleteWordOptions) {
      customizationId = deleteWordOptions.customizationId;
      wordName = deleteWordOptions.wordName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param customizationId the customizationId
     * @param wordName the wordName
     */
    public Builder(String customizationId, String wordName) {
      this.customizationId = customizationId;
      this.wordName = wordName;
    }

    /**
     * Builds a DeleteWordOptions.
     *
     * @return the deleteWordOptions
     */
    public DeleteWordOptions build() {
      return new DeleteWordOptions(this);
    }

    /**
     * Set the customizationId.
     *
     * @param customizationId the customizationId
     * @return the DeleteWordOptions builder
     */
    public Builder customizationId(String customizationId) {
      this.customizationId = customizationId;
      return this;
    }

    /**
     * Set the wordName.
     *
     * @param wordName the wordName
     * @return the DeleteWordOptions builder
     */
    public Builder wordName(String wordName) {
      this.wordName = wordName;
      return this;
    }
  }

  private DeleteWordOptions(Builder builder) {
    Validator.notEmpty(builder.customizationId, "customizationId cannot be empty");
    Validator.notEmpty(builder.wordName, "wordName cannot be empty");
    customizationId = builder.customizationId;
    wordName = builder.wordName;
  }

  /**
   * New builder.
   *
   * @return a DeleteWordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the customizationId.
   *
   * The customization ID (GUID) of the custom language model that is to be used for the request. You must make the
   * request with service credentials created for the instance of the service that owns the custom model.
   *
   * @return the customizationId
   */
  public String customizationId() {
    return customizationId;
  }

  /**
   * Gets the wordName.
   *
   * The custom word for the custom language model. When you add or update a custom word with the **Add a custom word**
   * method, do not include spaces in the word. Use a `-` (dash) or `_` (underscore) to connect the tokens of compound
   * words.
   *
   * @return the wordName
   */
  public String wordName() {
    return wordName;
  }
}
