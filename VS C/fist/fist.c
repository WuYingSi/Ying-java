#include <stdio.h>
#include <windows.h>
#include <math.h>

//int main()
//{
//	int N, d;
//	scanf_s("%d", &N);
//	for(int a = 0; a * a <= N; a++) {
//		for (int b = a; a * a + b * b <= N; b++) {
//			for (int c = b; a * a + b * b + c * c <= N; c++) {
//				d = sqrt(N - a * a - b * b - c * c);
//				//sqrt(开方根)
//				if (a * a + b * b + c * c + d * d == N) {
//					printf("%d %d %d %d\n", a, b, c, d);
//					return 0;
//				}
//			}
//		}
//	}
//}

int main() {

	int nums[6] = {0};
	printf("请输入数组中的内容：\n");
	printf("nums = ");
	for (int i = 0; i < 6; i++) {
		scanf_s("%d ", &nums[i]);
	}
	int t = 0;
	printf("target=");
	scanf_s("%d ", &t);
	return 0;
}