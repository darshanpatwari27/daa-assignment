int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    int* result = (int*)malloc(numsSize * sizeof(int));
    if (result == NULL) {
        *returnSize = 0;
        return NULL; 
    }
    for (int i = 0; i < n; i++) {
        result[2 * i] = nums[i];      
        result[2 * i + 1] = nums[i + n];
    }
    *returnSize = numsSize;
    return result;
}