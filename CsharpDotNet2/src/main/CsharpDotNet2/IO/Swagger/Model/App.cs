using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class App {
    /// <summary>
    /// Gets or Sets Title
    /// </summary>
    [DataMember(Name="title", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "title")]
    public string Title { get; set; }

    /// <summary>
    /// Gets or Sets BundleIdentifier
    /// </summary>
    [DataMember(Name="bundle_identifier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bundle_identifier")]
    public string BundleIdentifier { get; set; }

    /// <summary>
    /// Gets or Sets PublicIdentifier
    /// </summary>
    [DataMember(Name="public_identifier", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "public_identifier")]
    public string PublicIdentifier { get; set; }

    /// <summary>
    /// Gets or Sets ReleaseType
    /// </summary>
    [DataMember(Name="release_type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "release_type")]
    public int? ReleaseType { get; set; }

    /// <summary>
    /// Gets or Sets Platform
    /// </summary>
    [DataMember(Name="platform", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "platform")]
    public string Platform { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class App {\n");
      sb.Append("  Title: ").Append(Title).Append("\n");
      sb.Append("  BundleIdentifier: ").Append(BundleIdentifier).Append("\n");
      sb.Append("  PublicIdentifier: ").Append(PublicIdentifier).Append("\n");
      sb.Append("  ReleaseType: ").Append(ReleaseType).Append("\n");
      sb.Append("  Platform: ").Append(Platform).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
