for file in *; do
  name_without_extension="${file%.*}"
  mkdir "$name_without_extension"
  mv "$file" "$name_without_extension"
done